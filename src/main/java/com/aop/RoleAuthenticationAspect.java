package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Aspect
public class RoleAuthenticationAspect {
    @Pointcut(value = "@annotation(RoleAuthentication)")
    public void pointcut() {
    }

    /**
     * 检查登录
     * @param proceedingJoinPoint
     * @return 403如果没登录
     * @throws Throwable
     */
    @Around("pointcut() && @annotation(RoleAuthentication) ")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getResponse();
        if (request.getSession().getAttribute("user") == null) {
            //没有登录
            response.setStatus(403);
            return null;
        }else{
            //已登录 放行
            return proceedingJoinPoint.proceed();
        }
    }
}
