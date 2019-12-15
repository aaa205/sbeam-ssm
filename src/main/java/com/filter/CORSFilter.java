package com.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 解决跨域
 */
@WebFilter(urlPatterns = "/*")
public class CORSFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.addHeader("Access-Control-Allow-Credentials","true");
        if (httpServletRequest.getHeader("Access-Control-Request-Method") != null
                && "OPTIONS".equals(httpServletRequest.getMethod())) {
            httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);

    }
}
