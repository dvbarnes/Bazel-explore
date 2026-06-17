
package com.example;
import com.google.gson.Gson;


public class ProjectRunner {
    public static void main(String[] args) {

        User user = new User("Alice", 30);
        Gson gson = new Gson();
        
        String json = gson.toJson(user);
        System.out.println(json); 
        // Output: {"name":"Alice","age":30}

        System.out.println("Hello, World!");
    }
}