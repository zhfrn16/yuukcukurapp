package com.example.myapplication.Rest;

import java.util.List;

import Model.GetBarber;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/data")
    Call<List<GetBarber>> getBarber(
    );
}
