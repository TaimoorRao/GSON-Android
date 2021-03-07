package com.example.task13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gson gson = new Gson();

        /**
         * Part 1 GSON Simple (DE)Serialization
         */
        /*
        Employee employee = new Employee("Asad", 20, "asad@gmail.com");
        String json = gson.toJson(employee);
        */
        /*
        String json = "{\"first_name\":\"Asad\",\"age\":20,\"mail\":\"asad@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */
        /**
         * Part 2 Nested Objects
         */
        /*
        Address address = new Address("Pakistan", "Karachi");
        Employee employee = new Employee("Asad", 20, "asad@gmail.com", address);
        String json = gson.toJson(employee);

        String json = "{\"address\":{\"city\":\"Karachi\",\"country\":\"Pakistan\"},\"age\":20,\"first_name\":\"Asad\",\"mail\":\"asad@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */
        /**
         * Part 3 Arrays and lists
         */
        /*
        Address address = new Address("Pakistan", "Karachi");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 19));
        family.add(new FamilyMember("Son", 1));
        Employee employee = new Employee("Asad", 20, "asad@gmail.com", address, family);
        String json = gson.toJson(family);

        String json = "[{\"age\":19,\"role\":\"Wife\"},{\"age\":1,\"role\":\"Son\"}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);
        */
        /**
         * Part 4 Excluding fields from the (DE)Serialization process
         * By using the transient keyword or the @Expose annotation
         */
        /**
         * GsonBuilder().excludeFieldsWithoutExposeAnnotation() is use to exclude
         * all fields from consideration for serialization or deserialization
         * that do not have the Expose annotation.
         */
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Employee employee = new Employee(
                "Asad",
                20,
                "asad@gmail.com",
                "12345"
        );
        String json_Result = gson.toJson(employee);

        String json = "{\"age\":30,\"firstName\":\"John\",\"mail\":\"john@mail.com\",\"password\":\"fdfarg2\"}";

        Employee employee1 = gson.fromJson(json, Employee.class);
    }
}