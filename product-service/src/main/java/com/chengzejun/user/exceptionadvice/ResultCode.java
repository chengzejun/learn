package com.chengzejun.user.exceptionadvice;

public enum ResultCode {

    SUCCESS(1000,"操作成功"),

    FAILED(1001,"响应失败"),

    ERROR(5000,"未知错误"),

    VALIDATA_FAILED(1002,"参数校验失败");


    private int code;

    private String msg;

    ResultCode(int code ,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
