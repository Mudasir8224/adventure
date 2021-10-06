package com.example.adventure;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    String baseURL = "https://reqres.in";


    @POST("/api/login")
    Call<LogInUserResponse> getLogInResponse(@Body LogInUserData logInUserData);

    @POST("/api/register")
    Call<SignUpResponseData> getSignUpResponse(@Body SignUpRequestData requestData);


}
