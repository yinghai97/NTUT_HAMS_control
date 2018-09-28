package com.example.user.ntut_hams_control;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("response")
    public   String response;
//    @SerializedName("name")
//    private  String Name;
//    @SerializedName("surname")
//    private  String Surname;

//    public String getSurname() {
//        return Surname;
//    }

    public String getResponse() {
        return response;
    }

//    public String getName() {
//        return Name;
//    }
}
