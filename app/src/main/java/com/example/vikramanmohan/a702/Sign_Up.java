package com.example.vikramanmohan.a702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.fejoa.library.Client;
import org.fejoa.library.crypto.CryptoException;

import java.io.File;
import java.io.IOException;

public class Sign_Up extends AppCompatActivity implements View.OnClickListener {

    Button registerBtn;
    EditText etName, etEmail, etuserId, etPassword,etServer;


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case  R.id.registerBtn:
            try {
                Client.create(new File("userdata.txt"),null,String.valueOf(etName.getText()),String.valueOf(etServer.getText()),String.valueOf(etuserId.getText()));

            } catch (IOException e) {
                startActivity(new Intent(this,Login.class));
            } catch (CryptoException e) {
                startActivity(new Intent(this,Login.class));
            }
                break;

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etServer = (EditText) findViewById(R.id.etServer);
        etEmail=(EditText) findViewById(R.id.etEmail);
        etuserId = (EditText) findViewById(R.id.etUserId);
        registerBtn = (Button) findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(this);
    }




}

