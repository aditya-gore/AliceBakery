package com.example.AliceBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting fr;
    @Autowired
    Syrup sr;
    public void bakeCake() {
        System.out.println("The cake is being baked!");
        System.out.println("Flavor: " + fr.getFrostingType());
        System.out.println("Syrup: " + sr.getSyrupType());
    }
}
