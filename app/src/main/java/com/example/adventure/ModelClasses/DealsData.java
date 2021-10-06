package com.example.adventure.ModelClasses;

public class DealsData {

    private String url = "";
    private String name;
    private String country;
    private String price;

    public DealsData(String url, String name, String country, String price) {
        this.url = url;
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
