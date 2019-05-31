package com.github.kdlug.strategy;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void calculatePrice() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculatePrice(100, false);

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculatePrice(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculatePrice(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculatePrice(100, false);
    }
}