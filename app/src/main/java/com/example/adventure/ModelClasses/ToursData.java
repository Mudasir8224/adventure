package com.example.adventure.ModelClasses;

public class ToursData {

    private String url = "";
    private String country;
    private String city;

    public ToursData(String url, String country, String city) {
        this.url = url;
        this.country = country;
        this.city = city;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
