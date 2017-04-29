package com.example.vikramanmohan.a702;

/**
 * Created by vikramanmohan on 28/04/17.
 */

public class user {
    String name,email,userid,password;
    int age;

    public user (String name,String email, String userid,String password,int age){

        this.name=name;
        this.email=email;
        this.userid=userid;
        this.password=password;
        this.age=age;

    }

    public user(String userid,String password) {
        this.userid = userid;
        this.password = password;
        this.name = "you dont have a name";
        this.email = "You dont have an e-mail id";
        this.age = 0;
    }
}
