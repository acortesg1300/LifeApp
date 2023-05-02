package com.corderoindustries.corderoapp;

import androidx.appcompat.app.AppCompatActivity;

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
    Button submit;
    Button next_fragment_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next_fragment_button = (Button)findViewById(R.id.next_fragment_button);
        next_fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GetNextPayment.class);
                startActivity(i);

            }
        });
    }
}
