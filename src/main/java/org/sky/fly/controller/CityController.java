package org.sky.fly.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.sky.fly.model.City;
import org.sky.fly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/city")
@ResponseBody
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{id}")
    public City getCity(@PathVariable Integer id) {
        return cityService.getById(id);
    }

    @GetMapping
    public Page<City> getCityList(@RequestParam Integer page, @RequestParam Integer size) {
        return cityService.page(new Page<>(page, size));
    }

    @GetMapping("/all")
    public List<City> getCityList() {
        return cityService.list();
    }

    @PostMapping
    public void addCity(@RequestBody City city) {
        cityService.save(city);
    }

    @PutMapping
    public void updateCity(@RequestBody City city) {
        cityService.updateById(city);
    }

    @DeleteMapping("/{id}")
    public void removeCity(@PathVariable Integer id) {
        cityService.removeById(id);
    }

}
