package com.fogcoding.templates.AnnotationInjection;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "animal111")
public class Animal {

    @Value("dolphin")
    private String name;
    @Value("3000")
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
