package com.controller;

import com.aop.RoleAuthentication;
import com.dto.CartDTO;
import com.pojo.User;
import com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping
    @RoleAuthentication
    public CartDTO getUserCart(HttpServletRequest request) {
        User user=(User) request.getSession().getAttribute("user");
        CartDTO cartDTO=new CartDTO();
        cartDTO.setItems(cartService.getUserCart(user.getId()));
        cartDTO.setRet(0);
        cartDTO.setMsg("success");
        return cartDTO;
    }
}
