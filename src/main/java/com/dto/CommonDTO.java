package com.dto;

public class CommonDTO {
    protected int ret;
    protected String msg;

    public CommonDTO() {
    }

    public CommonDTO(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
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
