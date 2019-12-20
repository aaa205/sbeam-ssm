package com.controller;

import com.pojo.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IndexController {
    @Autowired
    private ProductService productService;

    /**
     * 获取首页内容
     *
     * @return 包含首页4个游戏的json数组
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<Product> getIndex() {
        return productService.getIndexProducts();
    }
}
