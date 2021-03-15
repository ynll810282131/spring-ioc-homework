package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.MyAutowired;
import com.lagou.edu.mvcframework.annotations.MyController;
import com.lagou.edu.mvcframework.annotations.MyRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Treasure baby
 */
@MyController
@MyRequestMapping("/demo")
@Security({"zhangsan", "lisi"})
public class DemoController {


    @MyAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param name
     * @return
     */
    @MyRequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response, String name) {
        return demoService.get(name);
    }

    @MyRequestMapping("/handler01")
    @Security({"zhangsan"})
    public String handler01(HttpServletRequest request, HttpServletResponse response, String name) {
        return demoService.get(name);
    }

    @MyRequestMapping("/handler02")
    @Security({"lisi"})
    public String handler02(HttpServletRequest request, HttpServletResponse response, String name) {
        return demoService.get(name);
    }

}
