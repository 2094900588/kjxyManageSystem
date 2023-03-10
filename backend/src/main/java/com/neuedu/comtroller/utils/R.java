package com.neuedu.comtroller.utils;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;

    private String msg;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public static R success(Object data){
        R r=new R(true,data);
        return r;
    }

    public static R fail(String msg){
        R r=new R(false,msg);
        return r;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
