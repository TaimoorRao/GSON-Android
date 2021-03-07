package com.example.task13;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @Expose
    private String firstName;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private String mail;
//    private Address address;
//    private List<FamilyMember> family;
    /**
     * To exclude the variable for json use transient
     */
    //private transient String password;

    private String password;
    public Employee(String firstName, int age, String mail, /*Address address, List<FamilyMember> family, */ String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
//        this.address = address;
//        this.family = family;
        this.password = password;
    }
}
