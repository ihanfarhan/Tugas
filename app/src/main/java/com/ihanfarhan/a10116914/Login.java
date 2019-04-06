package com.ihanfarhan.a10116914;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_login (View view) {
        Intent intent = new Intent(Login.this, Biodata.class);
        startActivity(intent);
    }
}
