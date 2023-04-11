package org.sky.fly;

import org.junit.jupiter.api.Test;
import org.sky.fly.model.City;
import org.sky.fly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CityServiceTest {

    @Autowired
    CityService cityService;

    @Test
    void testGetList() {
        List<City> list = cityService.list();
        list.forEach(System.out::println);
    }

}
