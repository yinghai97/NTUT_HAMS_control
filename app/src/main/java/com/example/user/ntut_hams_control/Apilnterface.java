package com.example.user.ntut_hams_control;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class Apilnterface {
    @GET("conn.php")
    Call<User> performRegistration(@Query("name") String Name, @Query("user_name") String Username, @Query("user_password") String Userpassword) {
        return null;
    }

    @GET("mysqlyo.php")
    Call<User> performUserLogin(@Query("user_name") String Username, @Query("user_password") String Userpassword) {
        return null;
    }

}
