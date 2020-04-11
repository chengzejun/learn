package com.chengzejun.user.exceptionadvice;

public class ResultVo<T> {
    private int code;

    private String msg;

    private T data;

    public ResultVo(T data){
        this(1000,"操作成功",data);
    }

    public ResultVo(ResultCode resultCode,T data){
        this.code=resultCode.getCode();
        this.msg=resultCode.getMsg();
        this.data=data;
    }

    public ResultVo(int code, String msg,T data){
        this.code=code;
        this.msg=msg;
        this.data=data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
