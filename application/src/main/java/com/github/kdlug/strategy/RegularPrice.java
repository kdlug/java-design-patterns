package com.github.kdlug.strategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        System.out.println("Regular price: " + price);

        if (isSignedUpForNewsletter) {
            System.out.println("Customer is signed up to the newsletter, different price strategy should be used");
        }
    }
}
