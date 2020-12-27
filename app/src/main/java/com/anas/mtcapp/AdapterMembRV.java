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

    public AdapterMembRV(Context context, ArrayList<MemberModel> MembArray) {
        this.context=context;
        this.MembArray=MembArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.member_model, parent, false);

        return (new ViewHolder(v));    }

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

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView MemberName , MemberDescrp;
        ImageView MemberImg ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            MemberName = itemView.findViewById(R.id.memberNameTV);
            MemberDescrp = itemView.findViewById(R.id.memberDescriptionTV);
            MemberImg = itemView.findViewById(R.id.memberImg);
        }
    }

}