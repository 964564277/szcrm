package com.gyf.szcrm.model;

import java.util.List;

public class PageResult<T> {
    private int code;//0成功，1失败
    private String msg;//提示消息
    private int count;//总记录数
    private List<T> data;//行数

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

//    @Override
//    public String toString() {
//        return "PageResult{" +
//                "code=" + code +
//                ", msg='" + msg + '\'' +
//                ", count=" + count +
//                ", data=" + data +
//                '}';
//    }
}
