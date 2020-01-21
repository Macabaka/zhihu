package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: Jack
 * @Date: 2020/1/16 10:33
 * @Description:
 */
@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    /**
     * 获取部分专题内容
     * @return
     */
    @GetMapping
    public Result getSpecial(){
        return Result.success(specialService.selectRecent());
    }

    /**
     * 获取所有专题内容
     * @return
     */
    @GetMapping(value = "/all")
    public Result getAllSpecial(){
        return Result.success(specialService.selectAll());
    }
}
