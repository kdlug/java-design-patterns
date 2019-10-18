package com.github.kdlug;

import com.github.kdlug.deliverybox.DeliverBoxFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		DeliverBoxFacade deliverBoxFacade = new DeliverBoxFacade();
		deliverBoxFacade.pickupPackage();
	}
}
