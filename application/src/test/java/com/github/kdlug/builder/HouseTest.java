package com.github.kdlug.builder;

import com.github.kdlug.Application;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HouseTest extends Application {
    @Test
    public void createHouse() {
        // Create an instances of concrete builders
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        // Create director and build builder
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        // Create instances of houses
        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}
