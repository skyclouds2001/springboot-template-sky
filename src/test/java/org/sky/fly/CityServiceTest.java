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
    void testSelect() {
        City city = cityService.getById(0);
        System.out.println(city);
    }

    @Test
    void testGetList() {
        List<City> list = cityService.list();
        list.forEach(System.out::println);
    }

    @Test
    void testInsert() {
        City city = new City();
        city.setName("test city");
        city.setDistrict("test district");
        city.setCountry("test country");
        city.setPopulation(1000);
        boolean result = cityService.save(city);
        System.out.println(result);
    }

    @Test
    void testUpdate() {
        City city = new City();
        city.setId(0);
        city.setName("test city");
        city.setDistrict("test district");
        city.setCountry("test country");
        city.setPopulation(1000);
        boolean result = cityService.updateById(city);
        System.out.println(result);
    }

    @Test
    void testRemove() {
        boolean result = cityService.removeById(0);
        System.out.println(result);
    }


}
