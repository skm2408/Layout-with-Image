package com.example.shubhammishra.layoutwithimage;

public class Profile {
    String name,address,city;
    Integer phone_number;
    Integer pincode;
    Integer imageResource;
    public Profile(String name, String address, String city, Integer phone_number, Integer pincode,Integer imageResource) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phone_number = phone_number;
        this.pincode = pincode;
        this.imageResource=imageResource;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public Integer getPincode() {
        return pincode;
    }
    public Integer getImageResource() {
        return imageResource;
    }
}
