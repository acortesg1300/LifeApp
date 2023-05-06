package com.corderoindustries.corderoapp;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView appName;
    TextView askForBirthdate;
    FloatingActionButton next_fragment_button;

    public void next(){
        Intent intent = new Intent(this, get_birthdate.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }
        }



