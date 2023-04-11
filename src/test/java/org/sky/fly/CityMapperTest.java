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
    void testSelectAll() {
        List<City> list = cityMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
