package com.example.vikramanmohan.a702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.fejoa.library.Client;
import org.fejoa.library.crypto.CryptoException;
import org.fejoa.server.JettyServer;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button loginBtn,cancelBtn;
    EditText etPassword;
    TextView etserver;
    private JettyServer server;



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.loginBtn:
                try {
                    Client.open(new File("userdata.txt"),null,String.valueOf(etPassword.getText()));
                    startActivity(new Intent(this,Login.class));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (CryptoException e) {
                    etPassword.setText("Invalid");
                } catch (JSONException e) {
                    etPassword.setText("Invalid");

                }
                break;

            case R.id.cancelBtn:
                startActivity(new Intent(this, Sign_Up.class));
                break;


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etserver=(TextView)findViewById(R.id.etServer);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        cancelBtn = (Button) findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(this);
        loginBtn.setOnClickListener(this);
        //startServer();

    }


//    private void startServer() throws Exception {
//        CookieHandler.setDefault(new CookiePerPortManager(null, CookiePolicy.ACCEPT_ALL));
//
//        server = new JettyServer(StorageLib.appendDir(MainActivity, "server"), JettyServer.DEFAULT_PORT);
//        server.start();
//    }
}
