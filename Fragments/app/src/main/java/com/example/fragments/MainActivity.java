package com.example.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
FragmentManager fragmentManager;
private Button addA;
    private Button removeA;
    private Button changeA;
    private Button addB;
    private Button removeB;
    private Button changeB;
    private LinearLayout show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        addA = findViewById(R.id.addA);
        removeA = findViewById(R.id.removeA);
        changeA = findViewById(R.id.changeA);
        addB = findViewById(R.id.addB);
        removeB = findViewById(R.id.removeB);
        changeB = findViewById(R.id.changeB);
        show = findViewById(R.id.Show);
        addA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragmanet_a fragmanet_a = new Fragmanet_a();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.Show,fragmanet_a,"A");
                transaction.commit();
            }
        });
        removeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragmanet_a fragmanet_a = (Fragmanet_a) fragmentManager.findFragmentByTag("A");
                if (fragmanet_a !=null){
                    transaction.remove(fragmanet_a);
                    transaction.commit();
                }
            }
        });

        changeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragment_b fragment_b = new Fragment_b();
                transaction.replace(R.id.Show,fragment_b);
                transaction.commit();
            }
        });
        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_b fragmanet_b = new Fragment_b();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.Show,fragmanet_b,"B");
                transaction.commit();
            }
        });
        removeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragment_b fragmanet_b = (Fragment_b) fragmentManager.findFragmentByTag("B");
                if (fragmanet_b !=null){
                    transaction.remove(fragmanet_b);
                    transaction.commit();
                }
            }
        });

        changeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Fragmanet_a fragment_a = new Fragmanet_a();
                transaction.replace(R.id.Show,fragment_a);
                transaction.commit();
            }
        });
    }
}
