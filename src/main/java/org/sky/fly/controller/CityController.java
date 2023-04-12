package org.sky.fly.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.sky.fly.model.City;
import org.sky.fly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "城市模块")
@Controller
@RequestMapping("/city")
@ResponseBody
public class CityController {

    @Autowired
    private CityService cityService;

    @Operation(summary = "获取城市信息", method = "GET", parameters = {
            @Parameter(name = "id", description = "城市ID", in = ParameterIn.PATH, required = true)
    })
    @GetMapping("/{id}")
    public City getCity(@PathVariable Integer id) {
        return cityService.getById(id);
    }

    @Operation(summary = "获取城市分页列表", method = "GET", parameters = {
            @Parameter(name = "page", description = "分页页码", in = ParameterIn.QUERY),
            @Parameter(name = "size", description = "分页容量", in = ParameterIn.QUERY)
    })
    @GetMapping
    public Page<City> getCityList(@RequestParam Integer page, @RequestParam Integer size) {
        return cityService.page(new Page<>(page, size));
    }

    @Operation(summary = "获取城市全部列表", method = "GET")
    @GetMapping("/all")
    public List<City> getCityList() {
        return cityService.list();
    }

    @Operation(summary = "添加城市", method = "POST")
    @PostMapping
    public void addCity(@RequestBody City city) {
        cityService.save(city);
    }

    @Operation(summary = "更新城市", method = "PUT")
    @PutMapping
    public void updateCity(@RequestBody City city) {
        cityService.updateById(city);
    }

    @Operation(summary = "删除城市", method = "DELETE", parameters = {
            @Parameter(name = "id", description = "城市ID", in = ParameterIn.PATH, required = true),
    })
    @DeleteMapping("/{id}")
    public void removeCity(@PathVariable Integer id) {
        cityService.removeById(id);
    }

}
