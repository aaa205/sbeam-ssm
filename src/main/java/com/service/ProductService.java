package com.service;

import com.dto.ProductDetailDTO;
import com.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> getIndexProducts();
    ProductDetailDTO getProductDetail(int id);

    /**
     * 根据关键词返回游戏
     * @param kw
     * @return
     */
    List<Product> selectProductsByKw(String kw);
}
