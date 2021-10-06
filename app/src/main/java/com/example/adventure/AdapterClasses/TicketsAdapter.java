package com.example.adventure.AdapterClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TicketsAdapter extends RecyclerView.Adapter<TicketsAdapter.viewHolderTickets> {

    List<TicketsData> ticketsDataList;

    public TicketsAdapter(List<TicketsData> ticketsDataList) {
        this.ticketsDataList = ticketsDataList;
    }

    @NonNull
    @Override
    public viewHolderTickets onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.tickets_rv,parent,false);
        return new viewHolderTickets(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderTickets holder, int position) {
        TicketsData ticketsData = ticketsDataList.get(position);
        holder.textView.setText(ticketsData.getName());
        Picasso.get().load(ticketsData.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return ticketsDataList.size();
    }


    public class viewHolderTickets extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolderTickets(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewTickets);
            textView = itemView.findViewById(R.id.textViewNameTickets);
        }
    }

}
