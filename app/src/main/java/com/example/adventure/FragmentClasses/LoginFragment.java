package com.example.adventure.FragmentClasses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adventure.ApiInterface;
import com.example.adventure.LoginActivity;
import com.example.adventure.MainActivity;
import com.example.adventure.R;
import com.example.adventure.SignUpActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginFragment extends Fragment {

    private Button buttonLogin, buttonSignUp;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        buttonLogin = rootView.findViewById( R.id.buttonLoginWelcome);

        buttonSignUp = rootView.findViewById( R.id.buttonSignUpWelcome);

        buttonLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), LoginActivity.class);

                startActivity(intent);
            }
        } );


        buttonSignUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), SignUpActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK );
                startActivity(intent);
            }
        } );


        return rootView;


    }
}
