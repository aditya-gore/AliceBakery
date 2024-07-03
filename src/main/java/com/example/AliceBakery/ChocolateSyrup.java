package com.example.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flavor", havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate";
    }
}
