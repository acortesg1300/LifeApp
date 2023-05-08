package com.corderoindustries.corderoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
//    FloatingActionButton next_fragment_button = findViewById(R.id.next_fragment_button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton next_fragment_button = findViewById(R.id.next_fragment_button);
        next_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new instance of the next fragment
                GetWage nextFragment = new GetWage();

                // Get the FragmentManager
                FragmentManager fragmentManager = getSupportFragmentManager();

                // Begin a FragmentTransaction
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // Replace the existing fragment with the new fragment
                fragmentTransaction.replace(R.id.fullscreen_fragment_container_view, nextFragment);

                // Add the transaction to the back stack
                fragmentTransaction.addToBackStack(null);

                // Commit the FragmentTransaction
                fragmentTransaction.commit();
            }
        });
            }
        }



