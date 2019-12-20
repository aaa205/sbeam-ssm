package com.controller;

import com.dto.CommonDTO;
import com.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常捕获
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonDTO handleBusinessException(BusinessException e){
        return new CommonDTO(e.getRet(),e.getMsg());
    }
}
