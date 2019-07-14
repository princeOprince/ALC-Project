package com.prince.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagehome);
        Toolbar alcBar = (Toolbar) findViewById(R.id.alc_bar);
        setSupportActionBar(alcBar);
    }

    public void aboutView(View view) {
        Intent about = new Intent(this, AboutALC.class);
        startActivity(about);
    }

    public void profileView(View view) {
        Intent profile = new Intent(this, Profile.class);
        startActivity(profile);
    }
}
