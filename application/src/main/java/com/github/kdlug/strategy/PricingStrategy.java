package com.github.kdlug.strategy;

public interface PricingStrategy {
    public void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
