package com.example.adventure.FragmentClasses;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adventure.AdapterClasses.DealsAdapter;
import com.example.adventure.AdapterClasses.TicketsAdapter;
import com.example.adventure.ModelClasses.DealsData;
import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.R;

import java.util.ArrayList;
import java.util.List;

public class DealsFragment extends Fragment {

 RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_deals, container, false);

        recyclerView = rootView.findViewById(R.id.recyclerViewDeals);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<DealsData> dealsData = new ArrayList<>();
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1579386947718-525ffdcf62ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","Place Fell","United Kingdom","$454"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1518684079-3c830dcef090?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","United Arab","Grenada","@2678"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","North Direction","California","$5674"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Desert Safari","Dubai","$887"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","Mersea Island","New Zeland","$897"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","World Trade","Belgium","$867"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","Walt Disney","Kaghistan","$786"));
        dealsData.add(new DealsData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","World Trade","America","$667"));

        DealsAdapter dealsAdapter = new DealsAdapter(dealsData);
        recyclerView.setAdapter(dealsAdapter);
    return rootView;
    }

}
