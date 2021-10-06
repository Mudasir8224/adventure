package com.example.adventure.FragmentClasses;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.adventure.AdapterClasses.TicketsAdapter;
import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TicketFragment extends Fragment {

    RecyclerView recyclerView;
    SwipeRefreshLayout refreshLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_ticket, container, false);

           recyclerView = rootView.findViewById(R.id.recyclerViewTickets);

           refreshLayout = rootView.findViewById(R.id.swipeRefresh);

           refreshLayout.setOnRefreshListener( new SwipeRefreshLayout.OnRefreshListener() {
               @Override
               public void onRefresh() {
                   refreshLayout.setRefreshing(false);
                   shuffleItems();

               }
           } );

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List <TicketsData> ticketsData = new ArrayList<>();
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579386947718-525ffdcf62ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","Place Fell, UK"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1518684079-3c830dcef090?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","Dubai, United Arab"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","California,North Direction"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Desert Safari, UAE"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","Mersea Island, United Kingdom"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","World Trade One, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","Walt Disney, United States"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","World Trade Center, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Jakarta, Indonesia"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1536323760109-ca8c07450053?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=701&q=80","Lago di Braies, Italy"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","California,North City"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Desert Safari, Dubai"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","Mersea Island, United Kingdom"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","World Trade One, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","Walt Disney Resort, United States"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","World Trade Center, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Jakarta, Indonesia"));

        TicketsAdapter ticketsAdapter = new TicketsAdapter(ticketsData);
        recyclerView.setAdapter(ticketsAdapter);
        return rootView;
    }


    public void shuffleItems() {
        // shuffle the ArrayList items and set the adapter
        List <TicketsData> ticketsData = new ArrayList<>();
        Collections.shuffle(ticketsData, new Random(System.currentTimeMillis()));
        TicketsAdapter ticketsAdapter = new TicketsAdapter(ticketsData);
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579386947718-525ffdcf62ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","Place Fell, UK"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1518684079-3c830dcef090?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","Dubai, United Arab"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","California,North Direction"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Desert Safari, UAE"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","Mersea Island, United Kingdom"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","World Trade One, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","Walt Disney, United States"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","World Trade Center, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Jakarta, Indonesia"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1536323760109-ca8c07450053?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=701&q=80","Lago di Braies, Italy"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","California,North City"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Desert Safari, Dubai"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","Mersea Island, United Kingdom"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","World Trade One, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","Walt Disney Resort, United States"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","World Trade Center, USA"));
        ticketsData.add(new TicketsData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Jakarta, Indonesia"));
        recyclerView.setAdapter(ticketsAdapter);

    }
}


