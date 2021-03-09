package com.anas.mtcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsEvents extends AppCompatActivity {
    public TextView titleEventDetailsTv,descrpEventDetailsTv ;
    public ImageView imgEventDetailsIv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_events);
        titleEventDetailsTv=findViewById(R.id.titleEventDetailsTv);
        descrpEventDetailsTv=findViewById(R.id.descrpEventDetailsTv);
        imgEventDetailsIv=findViewById(R.id.imgEventDetailsIv);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("event_name");
            String descrp = extras.getString("event_description");
            int img = extras.getInt("event_images");
            titleEventDetailsTv.setText(name);
            descrpEventDetailsTv.setText(descrp);
            imgEventDetailsIv.setImageResource(img);
        }
    }
}