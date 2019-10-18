package com.github.kdlug;

import com.github.kdlug.bank.AtmMachineFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
		atmMachineFacade.withdrawMoney();
	}

}
