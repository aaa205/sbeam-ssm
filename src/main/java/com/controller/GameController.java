package com.controller;

import com.dto.CommonDTO;
import com.dto.ProductDetailDTO;
import com.pojo.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 插入一个游戏
     * @param form
     * @return 新插入行Product
     */
    @PostMapping
    public Product addGame(@RequestBody Product form){
        productService.insertProduct(form);
        return form;
    }

    /**
     * 更新游戏
     * @param form
     * @return
     */
    @PutMapping
    public CommonDTO updateGame(@RequestBody  Product form){
        productService.updateProduct(form);
        return new CommonDTO(0,"success");
    }

    /**
     * 删除游戏
     * @param delIds
     * @return
     */
    @DeleteMapping
    public CommonDTO deleteGames(@RequestBody  List<Integer> delIds){
        int affect=productService.deleteProductById(delIds);
        return new CommonDTO(0,"删除了"+affect+"行");
    }

}
