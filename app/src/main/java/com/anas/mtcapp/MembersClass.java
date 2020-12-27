package com.anas.mtcapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class MembersClass  extends AppCompatActivity {
    public ImageView  entt , memberLogo ;
    public RecyclerView memberRV;
    AdapterMembRV myAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        entt =findViewById(R.id.EnteteMemb);
        memberLogo = findViewById(R.id.memberLogPage);
        memberRV = findViewById(R.id.membersRV);
        memberRV.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new AdapterMembRV(this,getMyList());
        memberRV.setAdapter(myAdapter);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }

    private ArrayList<MemberModel> getMyList() {
        ArrayList<MemberModel> MemeberModels = new ArrayList<>();

        MemberModel rawaa =new MemberModel();
        rawaa.setMemberName("Rawaà Bel Hadj Amor ");
        rawaa.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier !");
        rawaa.setMemberImg(R.drawable.raw1);
        MemeberModels.add(rawaa);
        MemberModel anas =new MemberModel();
        anas.setMemberName("ANAS Gara ");
        anas.setMemeberDescription("hello i am Anas a student at lf3 info isimm blablablablabalb i am presedent of  Microsoft Tech Club  !");
        anas.setMemberImg(R.drawable.cuteaf);
        MemeberModels.add(anas);
        MemberModel fedi =new MemberModel();
      fedi.setMemberName("Fedi Abdouli");
        fedi.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
       fedi.setMemberImg(R.drawable.vers1);
        MemeberModels.add(fedi);
        MemberModel eya =new MemberModel();
      eya.setMemberName("Eya Saied");
        eya.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
        eya.setMemberImg(R.drawable.cuteaff);
        MemeberModels.add(eya);
        MemberModel oussema =new MemberModel();
        oussema.setMemberName("Oussema Omar");
        oussema.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
        oussema.setMemberImg(R.drawable.raw2);
        MemeberModels.add(oussema);
        MemberModel ons =new MemberModel();
        ons.setMemberName("Ons Bahri");
        ons.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
        ons.setMemberImg(R.drawable.vers1);
        MemeberModels.add(ons);
        MemberModel chaimaz =new MemberModel();
       chaimaz.setMemberName("Chaima Zebid");
        chaimaz.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
        chaimaz.setMemberImg(R.drawable.white_members);
        MemeberModels.add(chaimaz);
        MemberModel necim =new MemberModel();
       necim.setMemberName("Necim Ben Mhenni");        necim.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
       necim.setMemberImg(R.drawable.white_members);
       MemeberModels.add(necim);
        MemberModel fares =new MemberModel();
       fares.setMemberName("Fares Hajlaoui");
        fares.setMemeberDescription("hello i am rawaa a student at lf3 info isimm blablablablabalb i am a vpf at Microsoft Tech Club and Trisorier ! !");
        fares.setMemberImg(R.drawable.white_members);
        MemeberModels.add(fares);
        return MemeberModels ;
    }


}

