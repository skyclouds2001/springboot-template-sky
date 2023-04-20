package org.sky.fly;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.sky.fly.mapper.CityMapper;
import org.sky.fly.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class CityMapperTest {

    @Autowired
    CityMapper cityMapper;

    @Test
    void testSelectById() {
        City city = cityMapper.selectById(1);
        System.out.println(city);
    }

    @Test
    void testSelectByBatchIds() {
        List<City> cities = cityMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        cities.forEach(System.out::println);
    }

    @Test
    void testSelectByBatchConditions() {
        Map<String, Object> map = new HashMap<>();
        map.put("district", "Guangdong");
        List<City> cities = cityMapper.selectByMap(map);
        cities.forEach(System.out::println);
    }

    @Test
    void testSelectPage() {
        Page<City> page = cityMapper.selectPage(new Page<>(1, 10), null);
        page.getRecords().forEach(System.out::println);
    }

    @Test
    void testSelectAll() {
        List<City> cities = cityMapper.selectList(null);
        cities.forEach(System.out::println);
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
