package com.service;

import com.dao.CartMapper;
import com.dao.OrderItemMapper;
import com.dao.OrderMapper;
import com.dto.CommitOrderDTO;
import com.dto.OrderDetailDTO;
import com.pojo.Cart;
import com.pojo.Order;
import com.pojo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<OrderDetailDTO> selectOrderDetailsByUserId(int userId) {
        return orderMapper.selectOrderListByUserId(userId);
    }

    @Override
    public List<OrderItem> selectAllOrderItem() {
        return orderItemMapper.selectAll();
    }

    @Transactional
    @Override
    public void creatOrder(CommitOrderDTO commitOrder, int userId) {
        List<Cart> carts = commitOrder.getItems();
        List<Integer> productIdSet = carts.stream().map(Cart::getProduct_id).collect(Collectors.toList());//取出所有符合的商品号
        List<OrderItem> orderItems = orderItemMapper.createOrderItemByProductId(productIdSet);//根据当前商品属性，创建订单内容
        Order order = new Order(userId, System.currentTimeMillis());
        orderMapper.insert(order);//新建订单
        int orderId = order.getId();//获取订单号
        //填充订单号和数量
        orderItems.forEach(x -> {
            x.setOrder_id(orderId);
            Cart c = carts.stream().filter(cart -> cart.getProduct_id() == x.getProduct_id())
                    .findFirst().get();
            x.setQuantity(c.getQuantity());
        });
        orderItemMapper.insertForEach(orderItems);//插入
        carts.forEach(cart -> cart.setUser_id(userId));//装填属性
        cartMapper.deleteForEach(carts);
    }
}
