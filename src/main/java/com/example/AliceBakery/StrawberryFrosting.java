package com.example.AliceBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flavor", havingValue = "Strawberry")
public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Strawberry";
    }
}
