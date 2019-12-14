package com.dao;

import com.pojo.Product;
import java.util.List;

public interface ProductMapper {
    int insert(Product record);

    List<Product> selectAll();
}