package com.example.user.ntut_hams_control;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apilnterface {
    @GET("Registeryh.php")
    Call<User> performRegistration(@Query("name") String Name,@Query("surname") String Surname, @Query("user_name") String Username, @Query("user_pass") String Userpassword) ;

    @GET("Loginyh.php")
    Call<User> performUserLogin(@Query("user_name") String Username, @Query("user_pass") String Userpassword) ;

}
