package com.github.kdlug.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChefTest {
    @Test
    public void chefTest() {
        // New order phard boiled egg
        Chef chef = new Chef("Erik");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        // New order soft boiled egg
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
