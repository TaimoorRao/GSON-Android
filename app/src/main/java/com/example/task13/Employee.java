package com.example.task13;

import com.google.gson.annotations.SerializedName;

public class Employee {
    
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;
    @SerializedName("address")
    private Address mAddress;

    public Employee(String firstName, int age, String mail, Address address) {
        mFirstName = firstName;
        mAge = age;
        mMail = mail;
        mAddress = address;
    }
}
