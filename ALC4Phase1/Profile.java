package com.prince.alc4phase1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Toolbar alcBar = (Toolbar) findViewById(R.id.alc_bar);
        setSupportActionBar(alcBar);
        ActionBar alc = getSupportActionBar();
        alc.setDisplayHomeAsUpEnabled(true);
    }
}
