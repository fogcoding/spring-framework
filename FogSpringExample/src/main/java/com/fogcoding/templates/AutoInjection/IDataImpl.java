package com.fogcoding.templates.AutoInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mydata")
public class IDataImpl implements IData {

    @Autowired
    @Qualifier("AutoTest")
    Animal animal;

    public String showData() {
        return "animal info, name=" + animal.getName() + "__price=" + animal.getPrice();
    }


}
