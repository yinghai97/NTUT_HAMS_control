package com.example.user.ntut_hams_control;

import android.widget.Toast;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
   // public  static  final String BASE_URl = "http://140.124.42.70:7780/";
    public static Retrofit retrofit = null;
    public  static  Retrofit getApiClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl("http://140.124.42.70:7780/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
