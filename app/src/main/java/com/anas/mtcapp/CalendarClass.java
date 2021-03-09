package com.anas.mtcapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class CalendarClass   extends AppCompatActivity implements RecycleViewOnItemClick {
    public ImageView logo, entete;
    public RecyclerView EventRV;
    public RecycleViewOnItemClick Listener;
    public TextView PastEventsTV;
    EventAdapterRV EventAdapter;
    ArrayList<EventModel> EventModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        logo = findViewById(R.id.calendarLogo);
        entete = findViewById(R.id.EnteteEvent);
        PastEventsTV = findViewById(R.id.PastEvents);
        EventRV = findViewById(R.id.EventsRV);
        EventRV.setLayoutManager(new LinearLayoutManager(this));
        EventAdapter = new EventAdapterRV(this, getMyList(), this);
        EventRV.setAdapter(EventAdapter);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }


    private ArrayList<EventModel> getMyList() {


        EventModel rawaa = new EventModel();
        rawaa.setEventName("rawaa ");
        rawaa.setEventDescription("sahit bb ");
        rawaa.setEventImg(R.drawable.raw1);
        EventModels.add(rawaa);

        EventModel rawaa1 = new EventModel();
        rawaa1.setEventName("bb");
        rawaa1.setEventDescription("hello  ");
        rawaa1.setEventImg(R.drawable.raw2);
        EventModels.add(rawaa1);

        EventModel rawaa2 = new EventModel();
        rawaa2.setEventName("First Event ");
        rawaa2.setEventDescription("hello there ");
        rawaa2.setEventImg(R.drawable.vers1);
        EventModels.add(rawaa2);

        EventModel rawaa3 = new EventModel();
        rawaa3.setEventName("First Event ");
        rawaa3.setEventDescription("hello there ");
        rawaa3.setEventImg(R.drawable.cuteaff);
        EventModels.add(rawaa3);

        EventModel rawaa4 = new EventModel();
        rawaa4.setEventName("First Event ");
        rawaa4.setEventDescription("hello there ");
        rawaa4.setEventImg(R.drawable.cuteaf);
        EventModels.add(rawaa4);
        EventModel anas = new EventModel();
        anas.setEventName("First Event ");
        anas.setEventDescription("hello there ");
        anas.setEventImg(R.drawable.rass1);
        EventModels.add(anas);

        EventModel anas1 = new EventModel();
        anas1.setEventName("First Event ");
        anas1.setEventDescription("hello there ");
        anas1.setEventImg(R.drawable.rass1);
        EventModels.add(anas1);

        EventModel rawaa5 = new EventModel();
        rawaa5.setEventName("First Event ");
        rawaa5.setEventDescription("hello there ");
        rawaa5.setEventImg(R.drawable.rass1);
        EventModels.add(rawaa5);


        return EventModels;
    }



    @Override
    public void onItemClick(View view, int position) {
        Log.d("hello", "wwwwwwwwwweeeew ");
        Intent intent = new Intent(this, DetailsEvents.class);
        intent.putExtra("event_images", EventModels.get(position).getEventImg());
        intent.putExtra("event_name", EventModels.get(position).getEventName());
        intent.putExtra("event_description", EventModels.get(position).getEventDescription());
        startActivity(intent);
    }
}