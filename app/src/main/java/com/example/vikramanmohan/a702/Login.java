package com.example.vikramanmohan.a702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.fejoa.library.Client;
import org.fejoa.library.UserData;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etEmail;
    Button logOutBtn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etName = (EditText) findViewById(R.id.etName);
        etName.setText(UserData.USER_DATA_CONTEXT.toString());



        logOutBtn = (Button) findViewById(R.id.logOutBtn);

        logOutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.logOutBtn:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}

