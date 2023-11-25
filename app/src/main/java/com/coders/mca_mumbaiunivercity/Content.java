package com.coders.mca_mumbaiunivercity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Content extends AppCompatActivity {
    ArrayList<String> sem1, sem2, sem3, sem4;
    ListView listView;
    ArrayAdapter<String> adapter;
    Intent intent;
    Intent intent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        listView = (ListView) findViewById(R.id.listView);
        sem1 = new ArrayList<>(Arrays.asList("Mathematical Foundation for Computer Science 1                 ", "Advanced Java                                                  ", "Advanced Database Management System", "Software Project Management                           ", "Data Structures Lab with C and / C++                         ", "Advanced Java LAB                             ", "Advanced Database Management System LAB                              ", "Web Technologies                                                          "));
        sem2 = new ArrayList<>(Arrays.asList("Mathematical Foundation for Computer Science 2                 ", "Artificial Intelligence and Machine Learning                   ", "Information Security                                                         ", "Robotic Process Automation                                     ", "Natural Language Processing                                  ", "Artificial Intelligence and Machine Learning Lab                              ", "Soft Skill Development Lab                                                        ", "Skill based Lab Course AWT Lab                                   ", "Skill based Lab Course User Interface Lab                            ", "Skill based Lab Course Networking with Linux Lab                "));
        sem3 = new ArrayList<>(Arrays.asList("Big Data Analytics and Visualization                      ", "Distributed System and Cloud Computing                     ", "Skill based Lab Mobile Computing Lab                         ", "Software Testing Quality Assurance Lab                             ", "Big Data Analytics and Visualization Lab                                         ", "Distributed System and Cloud Computing Lab                           "));
        sem4 = new ArrayList<>(Arrays.asList("No content yet.. will updates shortly                      "));
        intent = getIntent();
        intent1 = new Intent(Content.this, Module.class);
        Integer Clicked_bt = intent.getIntExtra("semester", -1);

        if(Clicked_bt == 0)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sem1);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position == 1)
                    {
                        startActivity(intent1);
                    }
                }
            });
        }
        else if(Clicked_bt == 1)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sem2);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position == 0)
                    {
                        intent1.putExtra("subject", 0);
                        startActivity(intent1);
                    }
                    else if(position == 1)
                    {
                        intent1.putExtra("subject", 1);
                        startActivity(intent1);
                    }
                    else if(position == 2)
                    {
                        intent1.putExtra("subject", 2);
                        startActivity(intent1);
                    }
                    else if(position == 3)
                    {
                        intent1.putExtra("subject", 3);
                        startActivity(intent1);
                    }
                    else if(position == 4)
                    {
                        intent1.putExtra("subject", 4);
                        startActivity(intent1);
                    }

                }
            });
        }
        else if(Clicked_bt == 2)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sem3);
            listView.setAdapter(adapter);
        }
        else if(Clicked_bt == 3)
        {
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sem4);
            listView.setAdapter(adapter);
        }
        else
        {
            Toast.makeText(this, "Something Went wrong", Toast.LENGTH_SHORT).show();
        }


    }
}