package com.github.kdlug.builder;

import com.github.kdlug.Application;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HouseTest extends Application {

    @Test
    public void createHouseTest() {
        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("floors")
                .buildGarage("garage")
                .buildRoof("roof")
                .build();
        System.out.println(house);
    }
}
