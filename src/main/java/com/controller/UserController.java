package com.controller;

import com.dto.CommonDTO;
import com.dto.UserRegisterDTO;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @param response
     * @param registerDTO
     * @return
     */
    @PostMapping("/register")
    public CommonDTO doRegister(HttpServletRequest request, HttpServletResponse response, @Valid @RequestBody UserRegisterDTO registerDTO) {
        //数据错误
        if (!registerDTO.getPassword().equals(registerDTO.getRepeat_password())) {
            return new CommonDTO(1, "重复密码不对");
        }
        User user = new User();
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        user.setName(registerDTO.getName());
        User newUser = userService.doRegister(user);//插入成功
        //保存用户信息到cookie
        setUserCookie(newUser,response);
        request.getSession().setAttribute("user", newUser);//标记登录
        return new CommonDTO(0, "注册成功");
    }

    @PostMapping("/login")
    public CommonDTO doLogin(HttpServletRequest request, HttpServletResponse response,  @Valid @RequestBody User user) {
        User newUser =userService.doLogin(user);
        if(newUser== null){
            return new CommonDTO(1,"邮箱或密码错误");
        }
        request.getSession().setAttribute("user",newUser);
        setUserCookie(newUser,response);
        return new CommonDTO(0,"登录成功");
    }

    @GetMapping("/logout")
    public CommonDTO doLogout(HttpServletRequest request,HttpServletResponse response){
        request.getSession().invalidate();
        Cookie cookie=new Cookie("isLogin",String.valueOf(false));
        cookie.setPath("/");
        response.addCookie(cookie);
        return new CommonDTO(0,"注销成功");
    }

    /**
     * 登录后设置cookie
     * @param user
     * @param response
     */
    private void setUserCookie(User user,HttpServletResponse response){
        Cookie [] cookies=new Cookie[4];
        cookies[0]=new Cookie("userID", user.getId().toString());
        cookies[1]=new Cookie("userName", user.getName());
        cookies[2]=new Cookie("avatar",user.getAvatar());
        cookies[3]=new Cookie("isLogin", String.valueOf(true));
        for(Cookie i:cookies){
            i.setPath("/");
            response.addCookie(i);
        }
    }
}
