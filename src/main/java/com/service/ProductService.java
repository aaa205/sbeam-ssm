package com.service;

import com.dto.ProductDetailDTO;
import com.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> getIndexProducts();

    ProductDetailDTO getProductDetail(int id);

    /**
     * 根据关键词返回游戏
     *
     * @param kw
     * @return
     */
    List<Product> selectProductsByKw(String kw);

    /**
     * 返回所有游戏信息
     *
     * @return
     */
    int insertProduct(Product record);
    int deleteProductById(List<Integer> ids);
    int updateProduct(Product record);
}
