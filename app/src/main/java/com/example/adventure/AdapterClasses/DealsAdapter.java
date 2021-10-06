package com.example.adventure.AdapterClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adventure.ModelClasses.DealsData;
import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DealsAdapter extends RecyclerView.Adapter<DealsAdapter.viewHolderDeals> {

    List<DealsData> dealsDataList;

    public DealsAdapter(List<DealsData> dealsDataList) {
        this.dealsDataList = dealsDataList;
    }

    @NonNull
    @Override
    public viewHolderDeals onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.deals_rv,parent,false);
        return new viewHolderDeals(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDeals holder, int position) {
        DealsData dealsData = dealsDataList.get(position);
        holder.textView.setText(dealsData.getName());
        holder.textViewCountry.setText(dealsData.getCountry());
        holder.buttonPrice.setText(dealsData.getPrice());
        Picasso.get().load(dealsData.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return dealsDataList.size();
    }


    public class viewHolderDeals extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        Button buttonPrice;
        TextView textViewCountry;
        public viewHolderDeals(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewDeals);
            textView = itemView.findViewById(R.id.textViewVisitingPlace);
            textViewCountry = itemView.findViewById(R.id.textViewCountryDeals);
            buttonPrice = itemView.findViewById(R.id.buttonDeals);
        }
    }

}
