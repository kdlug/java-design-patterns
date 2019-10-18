package com.github.kdlug;

import com.github.kdlug.deliverybox.DeliveryBox;
import com.github.kdlug.deliverybox.DeliveryBoxSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		pickupPackage();
	}

	private static void pickupPackage() {
		DeliveryBox deliveryBox = new DeliveryBox();
		DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();

		deliveryBox.getUserData();
		if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
			deliveryBox.openBox();
		}
	}
}
