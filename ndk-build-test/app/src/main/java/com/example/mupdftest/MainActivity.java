package com.example.mupdftest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void hello(View view) {

       String s =  HelloJni.hello();
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }
}