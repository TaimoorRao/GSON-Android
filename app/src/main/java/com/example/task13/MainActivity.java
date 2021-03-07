package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Employee employee = new Employee("John", 30, "john@gmail.com");
        String json = gson.toJson(employee);
        */
        /*
        String json = "{\"first_name\":\"John\",\"age\":30,\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */

        /*
        Address address = new Address("Germany", "Berlin");
        Employee employee = new Employee("John", 30, "john@gmail.com", address);
        String json = gson.toJson(employee);

        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */

        /*
        Address address = new Address("Germany", "Berlin");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Daughter", 5));
        Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
        String json = gson.toJson(family);
        */
        String json = "[{\"age\":30,\"role\":\"Wife\"},{\"age\":5,\"role\":\"Daughter\"}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);
    }
}