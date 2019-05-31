package com.github.kdlug.strategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
