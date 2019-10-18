package com.github.kdlug.deliverybox;

public class DeliverBoxFacade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliverBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {
        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
