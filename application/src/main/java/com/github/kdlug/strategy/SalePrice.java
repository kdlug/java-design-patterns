package com.github.kdlug.strategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        System.out.println("Sale price: " + price/2);

        if (!isSignedUpForNewsletter) {
            System.out.println("Customer is not signed up to the newsletter, different price strategy should be used");
        }
    }
}
