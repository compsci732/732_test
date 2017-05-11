package com.example.vikramanmohan.a702;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

public class Sign_Up extends AppCompatActivity implements View.OnClickListener {

    Button registerBtn;
    EditText etName, etAge, etEmail, etuserId, etPassword;


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case  R.id.registerBtn:
                startActivity(new Intent(this,MainActivity.class));
                break;


        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etEmail=(EditText) findViewById(R.id.etEmail);
        etuserId = (EditText) findViewById(R.id.etUserId);
        registerBtn = (Button) findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(this);
    }




}

