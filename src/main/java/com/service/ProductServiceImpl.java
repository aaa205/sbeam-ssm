package com.service;

import com.dao.ProductMapper;
import com.dto.ProductDetailDTO;
import com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getIndexProducts() {
        return productMapper.selectIndexProducts();
    }

    @Override
    public ProductDetailDTO getProductDetail(int id) {
        return productMapper.selectProductDetailById(id);
    }

    @Override
    public List<Product> selectProductsByKw(String kw) {
        return productMapper.selectProductsByKw(kw);
    }


}
