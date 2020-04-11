package com.chengzejun.user.exceptionadvice;

import lombok.Getter;


public class ApiExection extends RuntimeException {

    private int code;

    private String msg;

    public ApiExection(){
        this.code=1001;
        this.msg="接口错误";
        //this(1001,"接口错误");
    }

    public ApiExection(String msg){
        this.code=1001;
        this.msg=msg;
    }

    public ApiExection(int code,String msg){
        super(msg);
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
