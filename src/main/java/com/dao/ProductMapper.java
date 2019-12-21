package com.dao;

import com.dto.ProductDetailDTO;
import com.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int insert(Product record);

    List<Product> selectAll();
    List<Product> selectIndexProducts();
    ProductDetailDTO selectProductDetailById(@Param("id") int id);
    List<Product> selectProductsByKw(@Param("kw") String kw);

}