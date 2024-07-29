package com.goodsending.product.repository;

import com.goodsending.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductCustomRepository {
  Page<Product> findByKeywordOrAllOrderByIdDesc(String keyword, Pageable pageable);
}
