package com.yh.study2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaox
 * @description
 * @date 2020/2/24 11:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

class User{
    private String userName;
    private String phone;
    private String mail;
    private String extra;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
    @RequestMapping("/list")
    public List<User> list(){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user=new User();
            user.setUserName("鸭梨"+(i+1));
            user.setPhone("1529088525"+(i+1));
            user.setMail("yali"+(i+1)+"@163.com");
            users.add(user);
        }
        return users;
    }
}
