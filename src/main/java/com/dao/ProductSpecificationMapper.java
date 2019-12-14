package com.dao;

import com.pojo.ProductSpecification;
import java.util.List;

public interface ProductSpecificationMapper {
    int insert(ProductSpecification record);

    List<ProductSpecification> selectAll();
}