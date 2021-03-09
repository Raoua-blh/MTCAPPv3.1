
package com.anas.mtcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsMembers extends AppCompatActivity   {
 public TextView nameMembersDetailsTv,descrpMemberDetailsTv ,test;
 public ImageView imgMembersDetailsIv ;
 MemberModel obj ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_members);
        nameMembersDetailsTv=findViewById(R.id.nameMembersDetailsTv);
        descrpMemberDetailsTv=findViewById(R.id.descrpMemberDetailsTv);
        test=findViewById(R.id.test);

        imgMembersDetailsIv=findViewById(R.id.imgMembersDetailsIv);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("member_name");
            String descrp = extras.getString("member_description");
            String testt = extras.getString("test");
            int img = extras.getInt("member_images");

            nameMembersDetailsTv.setText(name);
            descrpMemberDetailsTv.setText(descrp);
            imgMembersDetailsIv.setImageResource(img);
            if (name=="Gara Anas ")
            {test.setText(testt);

            }
        }
    }
}