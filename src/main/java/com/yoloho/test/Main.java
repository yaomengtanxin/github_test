package com.yoloho.test;

import com.yoloho.entity.User;

/**
 * Created by zhaolei on 16-5-10.
 */
public class Main {
    public static void main(String[] args) {
        User[] userArr= new User[1];
        User u = new User();
        u.setName("zhangsan");
        userArr[0] = u;
        change(userArr);
        System.out.println(userArr[0].getName());
    }

    public static void change(User[] userArr) {
        User u1 = userArr[0];
        User u2 = userArr[0];
        System.out.println(u1.getName() + "--" + u2.getName() + userArr[0].getName());
        u1.setName("wangwu");
        System.out.println(u1.getName() + "--" + u2.getName() + userArr[0].getName());
    }
}
