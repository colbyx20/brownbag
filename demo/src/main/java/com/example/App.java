package com.example;

import java.util.HashMap;

class Data {
    int id;
    String user;

    public Data(int id, String user) {
        this.id = id;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Data{Id=" + id + ", user=" + user + "}";
    }
}

public class App {
    HashMap<Integer, Data> mymap = new HashMap<>(); 

    public static void main(String[] args) {
        App app = new App();
        app.run();

        System.out.println("Hello World!");
    }

    public void run() {
        // Create some Data objects
        Data d1 = new Data(1, "name1");
        Data d2 = new Data(2, "name2");

        // Store Data objects into HashMap
        mymap.put(d1.id, d1);
        mymap.put(d2.id, d2);

        // Print the contents of the HashMap
        for (Integer key : mymap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mymap.get(key));
        }
    }
}
