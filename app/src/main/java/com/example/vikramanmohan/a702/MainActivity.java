package com.example.vikramanmohan.a702;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.fejoa.library.remote.SimpleJsonRemoteJob;
import org.fejoa.library.support.Task;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button loginBtn;
    EditText etUserName,etPassword;
    TextView registerLink;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginBtn:
                startActivity(new Intent(this,Login.class));

                break;
            case R.id.registerLink:
                startActivity(new Intent(this,Sign_Up.class));
                break;


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        registerLink = (TextView) findViewById(R.id.registerLink);
        registerLink.setOnClickListener(this);


    }

}
