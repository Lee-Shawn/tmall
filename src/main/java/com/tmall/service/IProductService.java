package com.tmall.service;

import com.tmall.common.ServerResponse;
import com.tmall.pojo.Product;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse setSaleStatus(Integer productId, Integer status);

}
