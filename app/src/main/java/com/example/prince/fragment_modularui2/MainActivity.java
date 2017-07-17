package com.example.prince.fragment_modularui2;

import android.content.Intent;
import android.content.res.Resources;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator{
    String s;
    Resources r=getResources();
    String[] a=r.getStringArray(R.array.descr);



    FragmentA fa;
    FragmentB fb;
    FragmentManager manager;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        //fa always present
        fa= (FragmentA) manager.findFragmentById(R.id.fragment);
        fb= (FragmentB) manager.findFragmentById(R.id.fragment2);
        fa.setCommunicator(this);
    }

    @Override
    public void respond(int data) {

            Intent i=new Intent(this,AnotherActivity.class);
            i.putExtra("index",data);
            startActivity(i);



    }
}
