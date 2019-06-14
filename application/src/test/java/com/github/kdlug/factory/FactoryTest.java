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
        Unit tank = new Tank(3, 0,50);
        Unit infantryman = new Rifleman(100,0,200);
    }
}
