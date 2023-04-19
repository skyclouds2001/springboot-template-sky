package org.sky.fly;

import org.junit.jupiter.api.Test;
import org.sky.fly.mapper.CityMapper;
import org.sky.fly.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CityMapperTest {

    @Autowired
    CityMapper cityMapper;

    @Test
    void testSelect() {
        City city = cityMapper.selectById(0);
        System.out.println(city);
    }

    @Test
    void testSelectAll() {
        List<City> list = cityMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    void testInsert() {
        City city = new City();
        city.setName("test city");
        city.setDistrict("test district");
        city.setCountry("test country");
        city.setPopulation(1000);
        int result = cityMapper.insert(city);
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
        int result = cityMapper.updateById(city);
        System.out.println(result);
    }

    @Test
    void testRemove() {
        int result = cityMapper.deleteById(0);
        System.out.println(result);
    }

}
