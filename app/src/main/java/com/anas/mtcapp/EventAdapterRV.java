package com.anas.mtcapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class EventAdapterRV extends RecyclerView.Adapter<EventAdapterRV.ViewHolder> {
    @NonNull
    private Context context;
    private List<EventModel> EventArray;

    public EventAdapterRV(Context context, ArrayList<EventModel> EventArray) {
        this.context=context;
        this.EventArray=EventArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.mtcmembers_circles, parent, false);

        return (new ViewHolder(v));    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.EventName.setText(EventArray.get(position).getEventName());
        holder.EventDescrp.setText(EventArray.get(position).getEventDescription());
//        holder.EventImg.setImageResource(EventArray.get(position).getEventImg());
        holder.circle.setImageResource(EventArray.get(position).getCircle());
        holder.circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent mIntent = new Intent(context, DetailsMembers.class);
//                mIntent.putExtra("Image", (Serializable) EventArray.get(holder.getAdapterPosition()));
//                context.startActivity(mIntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return EventArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView EventName , EventDescrp;
        ImageView EventImg , circle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            EventName = itemView.findViewById(R.id.EventNameTV);
            EventDescrp = itemView.findViewById(R.id.EventDescriptionTV);
           // EventImg = itemView.findViewById(R.id.eventImg);
            circle = itemView.findViewById(R.id.circle);
        }
    }
    public interface onMemberListener{
        void OnMemberClick(int position);
    }

}