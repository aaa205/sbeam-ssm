package com.controller;

import com.aop.RoleAuthentication;
import com.dto.CartDTO;
import com.dto.CommonDTO;
import com.pojo.Cart;
import com.pojo.User;
import com.service.CartService;
import com.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public CommonDTO addUserCartItem(HttpSession session, @PathParam("add") String add) {
        Cart cart = GsonUtil.INSTANCE.fromJson(add, Cart.class);
        cart.setUser_id(((User) session.getAttribute("user")).getId());//填充用户id
        cartService.addCart(cart);
        return new CommonDTO(0,"update success");
    }
}
