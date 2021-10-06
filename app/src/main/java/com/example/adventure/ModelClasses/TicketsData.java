package com.example.adventure.ModelClasses;

public class TicketsData {

    String url = "";
    String name;

    public TicketsData(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
