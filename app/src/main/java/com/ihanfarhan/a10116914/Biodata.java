package com.ihanfarhan.a10116914;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void btn_biodata (View view) {
        Intent intent = new Intent(Biodata.this, Beres.class);
        startActivity(intent);
    }
}
