package org.sky.fly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.sky.fly.model.City;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CityService extends IService<City> {
}
