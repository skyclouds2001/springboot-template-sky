package org.sky.fly.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.sky.fly.entity.City;
import org.springframework.transaction.annotation.Transactional;

/**
 * city service interface
 *
 * @author skyclouds2001
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Transactional
public interface CityService extends IService<City> {
}
