package com.example.adventure.FragmentClasses;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adventure.AdapterClasses.TicketsAdapter;
import com.example.adventure.AdapterClasses.ToursAdapter;
import com.example.adventure.ModelClasses.TicketsData;
import com.example.adventure.ModelClasses.ToursData;
import com.example.adventure.R;

import java.util.ArrayList;
import java.util.List;

public class ToursFragment extends Fragment {
 RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tours, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerViewTours);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ToursData> toursData = new ArrayList<>();
        toursData.add(new ToursData("https://images.unsplash.com/photo-1579386947718-525ffdcf62ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80","UK","Place Fell"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1518684079-3c830dcef090?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","Dubai","United Arab"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","California","North Direction"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","UAE","Desert Safari"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","United Kingdom","Marvius"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","USA","World Trade"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","United States","Walt Disney"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","USA","World Trade"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Indonesia","Jakarta"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1536323760109-ca8c07450053?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=701&q=80","Italy","Gdi Braies"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1579390668747-a917e5dabc10?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80","North City","California"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","Dubai","Desert Safari"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1549944850-84e00be4203b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=962&q=80","UAE","Desert Safari"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1527510324148-d503699fe7f5?ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80","United Kingdom","Marvius"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1558031385-bf8e8ece59fe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80","USA","World Trade"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1539886075737-7a69d4c28c33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=674&q=80","United States","Walt Disney"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1582436416930-f533b50a7cd8?ixlib=rb-1.2.1&auto=format&fit=crop&w=676&q=80","USA","World Trade"));
        toursData.add(new ToursData("https://images.unsplash.com/photo-1502086223501-7ea6ecd79368?ixlib=rb-1.2.1&auto=format&fit=crop&w=1023&q=80","Indonesia","Jakarta"));

        ToursAdapter toursAdapter = new ToursAdapter(toursData);
        recyclerView.setAdapter(toursAdapter);
        return rootView;
    }
}


