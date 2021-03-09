package com.anas.mtcapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MembersClass  extends AppCompatActivity implements RecycleViewOnItemClick{
    public ImageView  entt , memberLogo ;
    public RecyclerView memberRV;
    AdapterMembRV myAdapter ;
    RecycleViewOnItemClick ClickListener;
    ArrayList<MemberModel> MemeberModels = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        entt =findViewById(R.id.enteteMember);
        memberLogo = findViewById(R.id.MemberLogo);
        memberRV = findViewById(R.id.EventsRV);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        memberRV.setLayoutManager(gridLayoutManager);

        myAdapter = new AdapterMembRV(this,getMyList(),this);
        memberRV.setAdapter(myAdapter);

    }

    private ArrayList<MemberModel> getMyList() {


        MemberModel rawaa =new MemberModel();
        rawaa.setMemberName("Gara Anas ");
        rawaa.setMemeberDescription("Presedent");
        rawaa.setMemberImg(R.drawable.anas);
        MemeberModels.add(rawaa);
        MemberModel anas =new MemberModel();
        anas.setMemberName("Bel Hadj Amor Rawaà ");
        anas.setMemeberDescription("Trésorier et VP Formation");
        anas.setMemberImg(R.drawable.rass1);
        MemeberModels.add(anas);
        MemberModel fedi =new MemberModel();
      fedi.setMemberName("Fedi Abdouli");
        fedi.setMemeberDescription("VP Community Manager");
       fedi.setMemberImg(R.drawable.fedii);
        MemeberModels.add(fedi);
        MemberModel eya =new MemberModel();
      eya.setMemberName("Eya Saied");
        eya.setMemeberDescription("general secretary\n");
        eya.setMemberImg(R.drawable.rass1);
        MemeberModels.add(eya);
        MemberModel oussema =new MemberModel();
        oussema.setMemberName("Oussema Omar");
        oussema.setMemeberDescription("VP Community Manager");
        oussema.setMemberImg(R.drawable.rass1);
        MemeberModels.add(oussema);
        MemberModel ons =new MemberModel();
        ons.setMemberName("Ons Bahri");
        ons.setMemeberDescription("general secretary........!");
        ons.setMemberImg(R.drawable.ons);
        MemeberModels.add(ons);
        MemberModel chaimaz =new MemberModel();
       chaimaz.setMemberName("Chaima Zebid");
        chaimaz.setMemeberDescription("VP Humain Resource");
        chaimaz.setMemberImg(R.drawable.rass1);
        MemeberModels.add(chaimaz);
        MemberModel necim =new MemberModel();
       necim.setMemberName("Necim Ben Mhenni");
       necim.setMemeberDescription("VP Media and Marketing ");
       necim.setMemberImg(R.drawable.necim);
       MemeberModels.add(necim);
        MemberModel fares =new MemberModel();
       fares.setMemberName("Fares Hajlaoui");
        fares.setMemeberDescription("VP Sponsoring");
        fares.setMemberImg(R.drawable.fares);
        MemeberModels.add(fares);
        MemberModel houssem =new MemberModel();
        houssem.setMemberName("Slimi Houssem");
        houssem.setMemeberDescription("VP Sponsoring");
        houssem.setMemberImg(R.drawable.houssem);
        MemeberModels.add(houssem);
        MemberModel yassine =new MemberModel();
        yassine.setMemberName("Yassine Landari");
        yassine.setMemeberDescription("VP Technical Resources");
        yassine.setMemberImg(R.drawable.yassine);
        MemeberModels.add(yassine);
        MemberModel wessim =new MemberModel();
        wessim.setMemberName("Wessim Meddeb");
        wessim.setMemeberDescription("VP Event");
        wessim.setMemberImg(R.drawable.wess);
        MemeberModels.add(wessim);
        MemberModel samar =new MemberModel();
        samar.setMemberName("Al Abed Samar");
        samar.setMemeberDescription("Assitant");
        samar.setMemberImg(R.drawable.samar);
        MemeberModels.add(samar);
        MemberModel rahma =new MemberModel();
        rahma.setMemberName("Bouchnak Rahma ");
        rahma.setMemeberDescription("VP Event");
        rahma.setMemberImg(R.drawable.rahma);
        MemeberModels.add(rahma);
        MemberModel safa =new MemberModel();
        safa.setMemberName("Safa Ayechi");
        safa.setMemeberDescription("Assitant");
        safa.setMemberImg(R.drawable.safe);
        MemeberModels.add(safa);
        MemberModel assil =new MemberModel();
        assil.setMemberName("Mhadhbi Assil");
        assil.setMemeberDescription("Assitant");
        assil.setMemberImg(R.drawable.wess);
        MemeberModels.add(assil);
        MemberModel chaimabougie =new MemberModel();
        chaimabougie.setMemberName("Rinez Chaima");
        chaimabougie.setMemeberDescription("Assitant");
        chaimabougie.setMemberImg(R.drawable.bougie);
        MemeberModels.add(chaimabougie);
        MemberModel jihen =new MemberModel();
        jihen.setMemberName("Jihen Messaoud");
        jihen.setMemeberDescription("Assitant");
        jihen.setMemberImg(R.drawable.jihen);
        MemeberModels.add(jihen);
        MemberModel manel =new MemberModel();
        manel.setMemberName("Manel Mahmoudi");
        manel.setMemeberDescription("Assitant");
        manel.setMemberImg(R.drawable.manel);
        MemeberModels.add(manel);
        MemberModel saif =new MemberModel();
        saif.setMemberName("Manel Mahmoudi");
        saif.setMemeberDescription("Assitant");
        saif.setMemberImg(R.drawable.saif);
        MemeberModels.add(saif);

        MemberModel fatma =new MemberModel();
        fatma.setMemberName("Fatma Gharouel");
        fatma.setMemeberDescription("Assitant");
        fatma.setMemberImg(R.drawable.fatma);
        MemeberModels.add(fatma);

        MemberModel medamine =new MemberModel();
        medamine.setMemberName("Med Amine Boussaid");
        medamine.setMemeberDescription("Assitant");
        medamine.setMemberImg(R.drawable.medamin);
        MemeberModels.add(medamine);

        MemberModel saber =new MemberModel();
        saber.setMemberName("Saber Berriche");
        saber.setMemeberDescription("Assitant");
        saber.setMemberImg(R.drawable.saif);
        MemeberModels.add(saber);

        MemberModel mariem =new MemberModel();
        mariem.setMemberName("Mariem Ben Ali");
        mariem.setMemeberDescription("Assitant");
        mariem.setMemberImg(R.drawable.manel);
        MemeberModels.add(mariem);

        MemberModel rached =new MemberModel();
        rached.setMemberName("Ben Nasr Rached");
        rached.setMemeberDescription("Assitant");
        rached.setMemberImg(R.drawable.rached);
        MemeberModels.add(rached);







        return MemeberModels ;
    }


    @Override
    public void onItemClick(View view, int position) {
        Log.d("hello", "hollla te5dem yeahh  ");
        Intent intent = new Intent(this, DetailsMembers.class);
        intent.putExtra("member_images", MemeberModels.get(position).getMemberImg());
        intent.putExtra("member_name", MemeberModels.get(position).getMemberName());
        intent.putExtra("member_description", MemeberModels.get(position).getMemeberDescription());
        startActivity(intent);
    }
}

