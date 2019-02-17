package com.nf147.platform.toolClass;

public class ResultVO<T> {
    private int code;
    private T data;
    private String error;
    private Throwable throwable;
    private int pageSize;


    public ResultVO() {
    }


    public ResultVO(int code, T data, String error, Throwable throwable) {
        this.code = code;
        this.data = data;
        this.error = error;
        this.throwable = throwable;
    }

    public ResultVO(int code, T data, int pageSize) {
        this.code = code;
        this.data = data;
        this.pageSize = pageSize;
    }

    public ResultVO(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public ResultVO<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultVO<T> setData(T data) {
        this.data = data;
        return this;
    }


    public String getError() {
        return error;
    }

    public ResultVO<T> setError(String error) {
        this.error = error;
        return this;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public ResultVO<T> setThrowable(Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public ResultVO<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
