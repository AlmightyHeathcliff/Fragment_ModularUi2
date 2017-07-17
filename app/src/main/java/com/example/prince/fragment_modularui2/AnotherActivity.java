package com.example.prince.fragment_modularui2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Prince on 04-07-2017.
 */

public class AnotherActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
       // super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.another);
        Intent intent=getIntent();
        int t=intent.getIntExtra("index",0);
        FragmentB fb= (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fb.clickclick(t);

    }
}
