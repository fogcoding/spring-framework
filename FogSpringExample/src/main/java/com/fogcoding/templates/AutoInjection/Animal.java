package com.fogcoding.templates.AutoInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "AutoTest")
public class Animal {

    @Value("ship")
    private String name;
    @Value("2300")
    private String price;

    public Animal() {
    }

    public Animal(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
