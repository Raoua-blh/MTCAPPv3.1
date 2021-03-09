package com.anas.mtcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ImageView mWhatsMTC;
    //  private ImageButton mButton;
    private ImageView mMembersIcon;
    private ImageView mCalendar;
    private ImageView mHistory;
    private TextView salutation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView textViewDate = findViewById(R.id.date);
        textViewDate.setText(currentDate);
        salutation = findViewById(R.id.greeting1);

        mWhatsMTC = findViewById(R.id.mtcLogo);
        mWhatsMTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsMTC();
            }
        });
        mMembersIcon = findViewById(R.id.membersIcon);
        mMembersIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMembers();
            }
        });
        mCalendar = findViewById(R.id.calendarLogo);
        mCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar();
            }
        });
        mHistory = findViewById(R.id.clockIcon);
        mHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });

    }
    private void openWhatsMTC(){
        Log.d("MTC","Works");
        Intent intent=new Intent(this, WhatsMTC.class);
        startActivity(intent);
    };
    private void openMembers(){
        Log.d("MTC","Works");
        Intent intent=new Intent(this, MembersClass.class);
        startActivity(intent);
    };
    private void openCalendar(){
        Log.d("MTC","Works");
        Intent intent=new Intent(this, CalendarClass.class);
        startActivity(intent);
    };
    private void openHistory(){
        Log.d("MTC","Works");
        Intent intent=new Intent(this, HistoryClass.class);
        startActivity(intent);
    };

}