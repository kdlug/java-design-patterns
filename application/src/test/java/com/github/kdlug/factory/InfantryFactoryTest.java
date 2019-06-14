package com.github.kdlug.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InfantryFactoryTest {
    @Test
    public void createObjects() {
        InfantryFactory infantryFactory = new RedInfantryUnitFactory();

        InfantryUnit tank = infantryFactory.createUnit(UnitType.TANK);
        InfantryUnit inframan = infantryFactory.createUnit(UnitType.RIFLEMAN);

        // we are under the same package in tests so this is still possible
        // but f.ex. from main it won't be possible
        InfantryUnit customType = new Rifleman(100,0,200);
    }
}
