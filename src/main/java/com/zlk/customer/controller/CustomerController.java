package com.zlk.customer.controller;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName： CustomerController
 * @Description：
 * @Author： yzh
 * @Date： 2019/10/10 9:16
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/toCustomer")
    public String toCustomer()throws Exception{
        return "";
    }
}
