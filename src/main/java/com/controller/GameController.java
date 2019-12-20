package com.controller;

import com.dto.ProductDetailDTO;
import com.pojo.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
    @Autowired
    private ProductService productService;

    /**
     * 根据id获取游戏详情页信息
     * @param id
     * @return json
     */
    @GetMapping("/{id}")
    public ProductDetailDTO getGameDetail(@PathVariable("id") int id) {
        return  productService.getProductDetail(id);

    }

    /**
     * 根据关键词搜索游戏卡片信息,如果关键词为空，返回所有游戏
     * @param kw 关键词
     * @return json
     */
    @GetMapping
    public List<Product> getGames(@PathParam("kw")String kw){
        return productService.selectProductsByKw(kw);
    }
}
