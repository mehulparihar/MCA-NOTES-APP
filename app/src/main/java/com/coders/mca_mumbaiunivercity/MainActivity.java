package com.coders.mca_mumbaiunivercity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Sem1, Sem2, Sem3, Sem4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sem1 = (Button) findViewById(R.id.sem1);
        Sem2 = (Button) findViewById(R.id.sem2);
        Sem3 = (Button) findViewById(R.id.sem3);
        Sem4 = (Button) findViewById(R.id.sem4);
        Intent intent = new Intent(MainActivity.this, Content.class);
        Sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("semester", 0);
                startActivity(intent);
            }
        });
        Sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("semester", 1);
                startActivity(intent);
            }
        });
        Sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("semester", 2);
                startActivity(intent);
            }
        });
        Sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("semester", 3);
                startActivity(intent);
            }
        });

    }
}