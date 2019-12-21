package com.controller;

import com.dto.CommonDTO;
import com.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常捕获
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {
    /**
     * 捕捉业务逻辑异常
     * @param e
     * @return
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public CommonDTO handleBusinessException(BusinessException e){
        return new CommonDTO(e.getRet(),e.getMsg());
    }

    /**
     * 捕捉数据校验异常
     * @param e
     * @return
     */
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    public CommonDTO handleNotValidException(MethodArgumentNotValidException e){
        return new CommonDTO(1,e.getMessage());
    }
}
