package com.zlk.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName： ProductController
 * @Description：
 * @Author： wy
 * @Date： 2019/10/10 9:02
 */
@Controller
@RequestMapping(value = "product")
public class ProductController {
    @RequestMapping(value = "/toProduct")
    public String product() throws Exception{
        return "product";
    }
}
