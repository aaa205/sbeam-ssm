package com.service;

import com.dao.ProductMapper;
import com.dto.CommonDTO;
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

    /**
     * 根据关键词搜索游戏，没有关键词返回全部
     * @param kw
     * @return
     */
    @Override
    public List<Product> selectProductsByKw(String kw) {
        return productMapper.selectProductsByKw(kw);
    }


    /**
     * 插入Product
     * @param record
     * @return 新插入的id
     */
    @Override
    public int insertProduct(Product record) {
        productMapper.insertForm(record);
        return record.getId();
    }

    /**
     * 删除符合id的行
     * @param ids
     * @return 被删除的行数
     */

    @Override
    public int deleteProductById(List<Integer> ids) {
        return productMapper.deleteById(ids);
    }

    /**
     * 更新指定的行
     * @param record
     * @return 被影响的行数
     */
    @Override
    public int updateProduct(Product record) {
        return productMapper.updateProduct(record);
    }

}
