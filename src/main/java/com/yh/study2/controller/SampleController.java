package com.yh.study2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaox
 * @description
 * @date 2020/2/8 20:35
 */
@RestController
@RequestMapping("/sample")
public class SampleController {


    @RequestMapping("/test")
    public String test()
    {
        return "hello zmgx!";
    }
}
