package com.example.pankaj.vtuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button1,button2,button3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button1 = (Button)findViewById(R.id.button8);
        button2 = (Button)findViewById(R.id.button9);
        button3 =(Button)findViewById(R.id.button8);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(First.this,ElectricalEngineering.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(First.this,Electronics.class));
            }
        });

        


    }
}
