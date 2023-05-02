package com.corderoindustries.corderoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.corderoindustries.myapplication.R;


public class MainActivity extends AppCompatActivity {
    TextView app_name;
    TextView title1;
    TextView title2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}