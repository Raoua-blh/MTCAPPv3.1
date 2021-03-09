package com.anas.mtcapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterMembRV extends RecyclerView.Adapter<AdapterMembRV.ViewHolder> {
    @NonNull
    private Context context;
    private List<MemberModel> MembArray;
    private RecycleViewOnItemClick clickListner;
    public AdapterMembRV(Context context, ArrayList<MemberModel> MembArray ,RecycleViewOnItemClick clickListner) {
        this.context=context;
        this.clickListner=clickListner ;
        this.MembArray=MembArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.mtcmembers_circles, parent, false);

        return (new ViewHolder(v ,clickListner));    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.MemberName.setText(MembArray.get(position).getMemberName());
        holder.MemberDescrp.setText(MembArray.get(position).getMemeberDescription());
        holder.MemberImg.setImageResource(MembArray.get(position).getMemberImg());

    }

    @Override
    public int getItemCount() {
        return MembArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView MemberName , MemberDescrp;
        ImageView MemberImg ;
private RecycleViewOnItemClick clickListener ;

        public ViewHolder(@NonNull View itemView , RecycleViewOnItemClick clickListner) {
            super(itemView);
            clickListener=clickListner;
            itemView.setOnClickListener(this);
            MemberName = itemView.findViewById(R.id.EventNameTV);
            MemberDescrp = itemView.findViewById(R.id.EventDescrpTV);
            MemberImg = itemView.findViewById(R.id.MemeberImg);
        }

        @Override
        public void onClick(View v) {
            clickListner.onItemClick(v , getAdapterPosition());
        }
    }

}