package com.dao;

import com.dto.IndexProductDTO;
import com.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface ProductMapper {
    int insert(Product record);

    List<Product> selectAll();
    List<IndexProductDTO> selectIndexProducts();
}