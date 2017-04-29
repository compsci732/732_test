package com.example.vikramanmohan.a702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

EditText etName,etEmail,etAge;
    Button logOutBtn;
    localdb userLocalDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName = (EditText) findViewById(R.id.etName);

        etAge = (EditText) findViewById(R.id.etAge);
        etEmail=(EditText) findViewById(R.id.etEmail);

        logOutBtn = (Button) findViewById(R.id.logOutBtn);
        logOutBtn.setOnClickListener(this);
        userLocalDB = new localdb(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
     /*   user user=userLocalDB.getLoggedInInfo();

        etAge.setText(user.age);
        etEmail.setText(user.email);
        etName.setText(user.name);*/

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logOutBtn:
                userLocalDB.clearUserData();
                startActivity(new Intent(this,MainActivity.class));

                break;
        }
    }
}