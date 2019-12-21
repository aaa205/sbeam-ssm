package com.dao;

import com.pojo.ProductSpecification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductSpecificationMapper {
    int insert(ProductSpecification record);

    List<ProductSpecification> selectAll();

    List<ProductSpecification> selectSpecByProductId(@Param("productId") int productId);
}