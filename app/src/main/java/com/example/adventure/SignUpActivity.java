package com.example.adventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUpActivity extends AppCompatActivity {

    EditText mEmailEt, mPasswordEt, mNameEt;
    Button buttonSignUpUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        mEmailEt = findViewById(R.id.editTextEmailSignUp);
        mPasswordEt = findViewById(R.id.editTextPasswordSignUp);

        buttonSignUpUser = findViewById(R.id.buttonSignUp);

        buttonSignUpUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpResponse();

            }
        });
    }

    public void signUpResponse() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SignUpRequestData signUpRequestData = new SignUpRequestData(mEmailEt.getText().toString(), mPasswordEt.getText().toString());
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<SignUpResponseData> call = apiInterface.getSignUpResponse(signUpRequestData);
        call.enqueue(new Callback<SignUpResponseData>() {
            @Override
            public void onResponse(Call<SignUpResponseData> call, Response<SignUpResponseData> response) {
                if (response.isSuccessful()) {
                    // Toast.makeText(ActivitySignUp.this, "save success " + response.body().toString(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                            Intent.FLAG_ACTIVITY_CLEAR_TASK |
                            Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    Toast.makeText(SignUpActivity.this, "signUp Successfully", Toast.LENGTH_SHORT).show();

                }else
                    try {
                        // SharedPreferences preferences = getSharedPreferences(myPreference,Context.MODE_PRIVATE);
                        // String hh  = preferences.getString("myPref",null);
                        // hh = buttonLogin.getText().toString();
                        LogInUserResponse jObjError = new LogInUserResponse("login", "user not found");
                        Toast.makeText(SignUpActivity.this, jObjError.error, Toast.LENGTH_LONG).show();
                        // Toast.makeText(ActivityLogin.this, jObjError.token, Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
            }

            @Override
            public void onFailure(Call<SignUpResponseData> call, Throwable t) {
                Log.d("Call", "onFailure : " + t.getMessage());
                Toast.makeText(SignUpActivity.this, "connect to internet", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
