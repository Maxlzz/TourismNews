package com.tyq.tourisamnews.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by max on 2016/3/20
 */
public class User extends BmobUser {

    private String nickName;
    private String sex;
    private String signature;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
