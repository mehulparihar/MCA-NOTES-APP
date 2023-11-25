package com.coders.mca_mumbaiunivercity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Module extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> module1;
    ArrayAdapter<String> adapter;
    ArrayList<String> maths, ai, is, rpa, nlp;
    Intent intent1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        listView1 = (ListView) findViewById(R.id.listModule);
        maths = new ArrayList<>(Arrays.asList("Linear Programming Problem", "Transportation Problem", "Assignment Problem & Travelling Salesman Problem", "Game Theory & Decision Making", "Queuing Models", "Simulation"));
        ai = new ArrayList<>(Arrays.asList("Introduction to AI", "Search Strategies", "Artificial Neural Networks", "Introduction to ML", "Forecasting and Learning Theory", "Kernel Machines & Ensemble Methods", "Dimensionality Reduction"));
        is = new ArrayList<>(Arrays.asList("Introduction to IS", "Cryptography and Authentication", "Digital certificates and integrity", "Internet and web security", "Firewall and IDS", "Database and OS Security"));
        rpa = new ArrayList<>(Arrays.asList("Introduction to RPA", "Process Methodologies and Planning", "BOT Development", "Deployment, Monitoring and Data Preparation for RPA", "Intelligent Automation & BOT Management", "Security of BOT", "RPA Technologies & Case Studies"));
        nlp = new ArrayList<>(Arrays.asList("No content"));
        intent1 = getIntent();
        intent = new Intent(Module.this, PdfView.class);
        Integer clicked = intent1.getIntExtra("subject", -1);
        if(clicked == 0)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, maths);
            listView1.setAdapter(adapter);
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = maths.get(position);
                    intent.putExtra("topic", s);
                    startActivity(intent);
                }
            });
        }
        else if(clicked == 1)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ai);
            listView1.setAdapter(adapter);
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = ai.get(position);
                    intent.putExtra("topic", s);
                    startActivity(intent);
                }
            });
        }
        else if(clicked == 2)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, is);
            listView1.setAdapter(adapter);
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = is.get(position);
                    intent.putExtra("topic", s);
                    startActivity(intent);
                }
            });
        }
        else if(clicked == 3)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rpa);
            listView1.setAdapter(adapter);
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = rpa.get(position);
                    intent.putExtra("topic", s);
                    startActivity(intent);
                }
            });
        }
        else if(clicked == 4)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nlp);
            listView1.setAdapter(adapter);
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = nlp.get(position);
                    intent.putExtra("topic", s);
                    startActivity(intent);
                }
            });
        }

    }
}