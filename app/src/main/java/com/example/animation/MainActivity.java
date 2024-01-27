package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;

import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class MainActivity extends AppCompatActivity {

    private DuoDrawerLayout drawerLayout;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "sss", Toast.LENGTH_SHORT).show();
            }
        });




  Toolbar toolbar = findViewById(R.id.toolbar);


     setSupportActionBar(toolbar);

        drawerLayout = (DuoDrawerLayout) findViewById(R.id.drawer);

        DuoDrawerToggle drawerToggle = new DuoDrawerToggle(this, drawerLayout, toolbar,
                R.string.Open_Drawer,
                R.string.Close_Drawer);


        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();


    }
}