package com.example.adventure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adventure.AdapterClasses.TabAdapter;
import com.example.adventure.FragmentClasses.DealsFragment;
import com.example.adventure.FragmentClasses.LoginFragment;
import com.example.adventure.FragmentClasses.TicketFragment;
import com.example.adventure.FragmentClasses.ToursFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
   ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new TicketFragment(),"Tickets");
        tabAdapter.addFragment(new DealsFragment(),"Deals");
        tabAdapter.addFragment(new ToursFragment(),"Tours");
        tabAdapter.addFragment(new LoginFragment(),"Profile");
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
