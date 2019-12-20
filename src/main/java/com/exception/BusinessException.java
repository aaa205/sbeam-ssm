package com.exception;

/**
 * 通用的业务异常类
 */
public class BusinessException extends RuntimeException {
    private int ret;
    private String msg;
    public BusinessException(int ret, String msg){
        super();
        this.ret=ret;
        this.msg=msg;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
