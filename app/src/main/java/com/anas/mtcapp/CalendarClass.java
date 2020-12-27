package com.anas.mtcapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anas.mtcapp.R;

import java.util.ArrayList;

public class CalendarClass   extends AppCompatActivity implements View.OnClickListener{
    public ImageView  logo , entete;
    public RecyclerView EventRV;
    public TextView PastEventsTV ;
   EventAdapterRV EventAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        logo = findViewById(R.id.calander);
        entete =findViewById(R.id.entetecalander);
        PastEventsTV =findViewById(R.id.PastEventsTV);
        EventRV = findViewById(R.id.membersRV);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        EventRV.setLayoutManager(gridLayoutManager);
        EventAdapter = new EventAdapterRV(this,getMyList());
        EventRV.setAdapter(EventAdapter);
//        EventRV.setOnClickListener(new AdapterView<>()
//
//
//
//
//                View.OnClickListener() {
//            @Override
//            public void onItemClick(View v) {
//
//            }
//        });
//
//
//

    }

    private ArrayList<EventModel> getMyList() {
        ArrayList<EventModel>EventModels = new ArrayList<>();

        EventModel rawaa =new EventModel();
        rawaa.setEventName("First Event ");
        rawaa.setEventDescription("hello there ");
        rawaa.setCircle(R.drawable.rass1);
        EventModels.add(rawaa);

        EventModel rawaa1 =new EventModel();
        rawaa1.setEventName("First Event ");
        rawaa1.setEventDescription("hello there ");
        rawaa1.setCircle(R.drawable.rass1);
        EventModels.add(rawaa1);

        EventModel rawaa2 =new EventModel();
        rawaa2.setEventName("First Event ");
        rawaa2.setEventDescription("hello there ");
        rawaa2.setCircle(R.drawable.rass1);
        EventModels.add(rawaa2);

        EventModel rawaa3 =new EventModel();
        rawaa3.setEventName("First Event ");
        rawaa3.setEventDescription("hello there ");
        rawaa3.setCircle(R.drawable.rass1);
        EventModels.add(rawaa3);

        EventModel rawaa4 =new EventModel();
        rawaa4.setEventName("First Event ");
        rawaa4.setEventDescription("hello there ");
        rawaa4.setCircle(R.drawable.rass1);
        EventModels.add(rawaa4);
        EventModel anas =new EventModel();
        anas.setEventName("First Event ");
        anas.setEventDescription("hello there ");
        anas.setCircle(R.drawable.rass1);
        EventModels.add(anas);

        EventModel anas1 =new EventModel();
        anas1.setEventName("First Event ");
        anas1.setEventDescription("hello there ");
        anas1.setCircle(R.drawable.rass1);
        EventModels.add(anas1);
        EventModel rawaa5 =new EventModel();
        rawaa5.setEventName("First Event ");
        rawaa5.setEventDescription("hello there ");
        rawaa5.setCircle(R.drawable.rass1);
        EventModels.add(rawaa5);



        return EventModels ;
    }




    @Override
    public void onClick(View v) {

    }
}
