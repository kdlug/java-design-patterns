package com.github.kdlug;

import com.github.kdlug.templateMethod.TypeOfTransport;
import com.github.kdlug.templateMethod.WeekDay;
import com.github.kdlug.templateMethod.WeekDayImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        WeekDay weekDay = new WeekDayImpl();
        weekDay.start(TypeOfTransport.BIKE);
	}

}
