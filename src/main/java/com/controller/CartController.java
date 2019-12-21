package com.controller;

import com.aop.RoleAuthentication;
import com.dto.CartDTO;
import com.dto.CartUpdateDTO;
import com.dto.CommonDTO;
import com.exception.BusinessException;
import com.pojo.Cart;
import com.pojo.User;
import com.service.CartService;
import com.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    /**
     * 获取用户的购物车信息，需要登录
     *
     * @param request
     * @return
     */
    @GetMapping
    @RoleAuthentication
    public CartDTO getUserCart(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        CartDTO cartDTO = new CartDTO();
        cartDTO.setItems(cartService.getUserCart(user.getId()));
        cartDTO.setRet(0);
        cartDTO.setMsg("success");
        return cartDTO;
    }

    @GetMapping("/addCartItems")
    @RoleAuthentication
    public CommonDTO addUserCart(HttpSession session, @PathParam("add") String add) {
        Cart cart = GsonUtil.INSTANCE.fromJson(add, Cart.class);
        cart.setUser_id(((User) session.getAttribute("user")).getId());//填充用户id
        cartService.pushToCart(cart);
        return new CommonDTO(0, "addQuantity success");
    }

    /**
     * 修改购物车内容
     *
     * @param session
     * @param cartUpdate
     * @return
     */
    @PostMapping("/asynUpdate")
    @RoleAuthentication
    public CommonDTO updateCart(HttpSession session, @Valid CartUpdateDTO cartUpdate) {
        Cart cart = new Cart();
        cart.setProduct_id(cartUpdate.getProduct_id());
        cart.setUser_id(((User) session.getAttribute("user")).getId());
        cart.setQuantity(cartUpdate.getQuantity());
        String type = cartUpdate.getType();
        if ("delete".equals(type)) {
            cartService.deleteCart(cart);
            return new CommonDTO(0,"success");
        } else if ("update".equals(type)) {
            cartService.updateCart(cart);
            return new CommonDTO(0,"success");
        }else{
            throw new BusinessException(1,"invalid type");
        }

    }
}
