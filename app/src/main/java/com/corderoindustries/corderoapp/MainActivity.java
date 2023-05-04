package com.corderoindustries.corderoapp;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView app_name;
    TextView title1;
    TextView title2;

    public void next(){
        Intent intent = new Intent(this, ask_for_next_payment_date.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton next_fragment_button = findViewById(R.id.next_fragment_button);
        next_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            next();
            }
        });
            }
        }



