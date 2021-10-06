package com.example.adventure.AdapterClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.ModelClasses.ToursData;
import com.example.adventure.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ToursAdapter extends RecyclerView.Adapter<ToursAdapter.viewHolderTours> {

    List<ToursData> toursDataList;

    public ToursAdapter(List<ToursData> toursDataList) {
        this.toursDataList = toursDataList;
    }

    @NonNull
    @Override
    public viewHolderTours onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.tours_rv,parent,false);
        return new viewHolderTours(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderTours holder, int position) {
        ToursData toursData = toursDataList.get(position);
        holder.textViewCountry.setText(toursData.getCountry());
        holder.textViewCity.setText(toursData.getCity());
        Picasso.get().load(toursData.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return toursDataList.size();
    }


    public class viewHolderTours extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewCountry;
        TextView textViewCity;
        public viewHolderTours(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewTours);
            textViewCountry = itemView.findViewById(R.id.textViewCountryTours);
            textViewCity = itemView.findViewById(R.id.textViewCityTours);
        }
    }

}
