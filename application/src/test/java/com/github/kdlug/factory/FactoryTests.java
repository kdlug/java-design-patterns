package com.github.kdlug.factory;

import com.github.kdlug.factory.car.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTests {
    @Test
    public void createCar() {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalwealthFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMax);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
