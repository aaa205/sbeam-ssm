package com.service;

import com.dao.ProductMapper;
import com.dto.IndexProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<IndexProductDTO> getIndexProducts() {
        return productMapper.selectIndexProducts();
    }
}
