package com.nf147.platform.toolClass;

import com.github.pagehelper.Page;

/**
 * @author 张东明
 * @info 结果类
 * @data 2019/2/20
 * */
public class ResultVo<T>{

    private int code;
    private T data;
    private Page page;
    private String error;
    private Throwable throwable;
    private int pageSize;



    public ResultVo() {
    }


    public ResultVo(int code, T data, Page page, String error, Throwable throwable) {
        this.code = code;
        this.data = data;
        this.page = page;
        this.error = error;
        this.throwable = throwable;
    }

    public ResultVo(int code, T data, Page page, int pageSize) {
        this.code = code;
        this.data = data;
        this.page = page;
        this.pageSize = pageSize;
    }

    public ResultVo(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public ResultVo<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultVo<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public ResultVo<T> setPage(Page page) {
        this.page = page;
        return this;
    }

    public String getError() {
        return error;
    }

    public ResultVo<T> setError(String error) {
        this.error = error;
        return this;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public ResultVo<T> setThrowable(Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public ResultVo<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}

