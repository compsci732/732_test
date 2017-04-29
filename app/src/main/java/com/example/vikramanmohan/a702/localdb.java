package com.example.vikramanmohan.a702;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by vikramanmohan on 29/04/17.
 */

public class localdb {

    public static final String SP_Name = "userDetails";
    SharedPreferences userLocalDB;

    public localdb(Context context) {
        userLocalDB = context.getSharedPreferences(SP_Name, 0);
    }

    public void storeUserData(user user) {
        SharedPreferences.Editor spEditor = userLocalDB.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("email", user.email);
        spEditor.putString("userid", user.userid);
        spEditor.putString("password", user.password);
        spEditor.putInt("age", user.age);
        spEditor.commit();
    }

    public user getLoggedInInfo() {
        String name = userLocalDB.getString("name", "you dont have a name");
        String email = userLocalDB.getString("email", "You dont have an e-mail id");
        String userid = userLocalDB.getString("userid", "");
        String password = userLocalDB.getString("password", "");
        int age = userLocalDB.getInt("age", 0);
        user storedUser = new user(name, email, userid, password, age);
        return storedUser;
    }





    public void clearUserData() {
        SharedPreferences.Editor spEditor = userLocalDB.edit();
        spEditor.clear();
        spEditor.commit();

    }
}
