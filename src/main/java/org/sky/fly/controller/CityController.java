package org.sky.fly.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.sky.fly.common.Result;
import org.sky.fly.entity.City;
import org.sky.fly.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * city controller class
 *
 * @author skyclouds2001
 * @version 1.1.0
 * @since 1.0.0
 */
@ApiSupport(author = "skyclouds2001")
@Tag(name = "城市模块")
@Controller
@RequestMapping("/city")
@ResponseBody
public class CityController {

    @Autowired
    private CityService cityService;

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "获取城市信息", method = "GET")
    @Parameters({
        @Parameter(name = "id", description = "城市 ID", in = ParameterIn.PATH, required = true)
    })
    @GetMapping("/{id}")
    public Result<City> getCity(@PathVariable Integer id) {
        return Result.ok(cityService.getById(id));
    }

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "获取城市分页列表", method = "GET")
    @Parameters({
        @Parameter(name = "page", description = "分页页码", in = ParameterIn.QUERY, example = "1"),
        @Parameter(name = "size", description = "分页容量", in = ParameterIn.QUERY, example = "10")
    })
    @GetMapping
    public Result<Page<City>> getCityList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return Result.ok(cityService.page(new Page<>(page, size)));
    }

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "获取城市全部列表", method = "GET")
    @GetMapping("/all")
    public Result<List<City>> getAllCityList() {
        return Result.ok(cityService.list());
    }

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "添加城市", method = "POST")
    @PostMapping
    public Result<?> addCity(@RequestBody @Valid City city) {
        cityService.save(city);
        return Result.ok();
    }

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "更新城市", method = "PUT")
    @PutMapping
    public Result<?> updateCity(@RequestBody @Valid City city) {
        cityService.updateById(city);
        return Result.ok();
    }

    @ApiOperationSupport(author = "skyclouds2001")
    @Operation(summary = "删除城市", method = "DELETE")
    @Parameters({
        @Parameter(name = "id", description = "城市 ID", in = ParameterIn.PATH, required = true),
    })
    @DeleteMapping("/{id}")
    public Result<?> removeCity(@PathVariable Integer id) {
        cityService.removeById(id);
        return Result.ok();
    }

}
