package com.github.kdlug.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {
    @Test
    public void createObjects() {
        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit inframan = factory.createUnit(UnitType.RIFLEMAN);

        // we are under the same package in tests so this is still possible
        // but f.ex. from main it won't be possible
        Unit customType = new Rifleman(100,0,200);
    }
}
