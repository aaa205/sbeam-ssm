package com.controller;

import com.dto.CommonDTO;
import com.dto.UserRegisterDTO;
import com.exception.BusinessException;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册账号
     *
     * @param request
     * @param registerDTO 注册表单
     * @param result      格式校验结果
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public CommonDTO doRegister(HttpServletRequest request, HttpServletResponse response, @Valid UserRegisterDTO registerDTO, BindingResult result){
        //数据错误
        if (result.hasErrors() || !registerDTO.getPassword().equals(registerDTO.getRepeat_password())) {
            return new CommonDTO(1, "格式不对");
        }
        User user = new User();
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        user.setName(registerDTO.getName());
        User newUser = userService.doRegister(user);//插入成功
        request.getSession().setAttribute("userID", newUser.getId());//标记登录
        //保存用户信息到cookie
        response.addCookie(new Cookie("userID", newUser.getId().toString()));
        response.addCookie(new Cookie("userName", newUser.getName()));
        response.addCookie(new Cookie("isLogin", "true"));
        return new CommonDTO(0, "注册成功");
    }
}
