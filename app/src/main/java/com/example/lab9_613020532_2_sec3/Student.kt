package com.example.lab9_613020532_2_sec3

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Student (
    @Expose
    @SerializedName("std_id") val std_id: String,

    @Expose
    @SerializedName("std_name") val  std_name: String,

    @Expose
    @SerializedName("std_age") val std_age:Int){}