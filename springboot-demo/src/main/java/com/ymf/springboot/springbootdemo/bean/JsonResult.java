package com.ymf.springboot.springbootdemo.bean;

/**
 * @author 姚美发
 * @name
 * @desc
 * @jdk 1.8
 * @group
 * @os win10
 * @date 2018/7/20
 */
public class JsonResult {
    private String status = null;

    private Object result = null;

    public JsonResult status(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
