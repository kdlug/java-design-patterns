package com.github.kdlug.builder;

import com.github.kdlug.Application;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HouseTest extends Application {
    @Test
    public void createHouse() {
        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
        House house2 = new House("walls", "floors", "roof");
    }
}