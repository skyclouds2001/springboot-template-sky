package org.sky.fly;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.sky.fly.entity.City;
import org.sky.fly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class CityServiceTest {

    @Autowired
    CityService cityService;

    @Test
    void testSelect() {
        City city = cityService.getById(1);
        System.out.println(city);
    }

    @Test
    void testSelectByBatchIds() {
        List<City> cities = cityService.listByIds(Arrays.asList(1, 2, 3));
        cities.forEach(System.out::println);
    }

    @Test
    void testSelectByBatchConditions() {
        Map<String, Object> map = new HashMap<>();
        map.put("district", "Guangdong");
        List<City> cities = cityService.listByMap(map);
        cities.forEach(System.out::println);
    }

    @Test
    void testSelectPage() {
        Page<City> page = cityService.page(new Page<>(1, 10));
        page.getRecords().forEach(System.out::println);
    }

    @Test
    void testSelectAll() {
        List<City> cities = cityService.list();
        cities.forEach(System.out::println);
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
