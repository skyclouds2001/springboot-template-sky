package org.sky.fly.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sky.fly.mapper.CityMapper;
import org.sky.fly.entity.City;
import org.sky.fly.service.CityService;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {
}
