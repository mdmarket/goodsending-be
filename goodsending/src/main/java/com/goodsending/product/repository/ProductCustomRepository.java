package com.goodsending.product.repository;

import com.goodsending.product.dto.response.MyProductSummaryDto;
import com.goodsending.product.dto.response.ProductSummaryDto;
import com.goodsending.product.entity.Product;
import com.goodsending.product.type.ProductStatus;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface ProductCustomRepository {

  List<Product> findTop5ByStartDateTimeAfterOrderByLikeCountDesc(LocalDateTime currentDateTime);

  Slice<ProductSummaryDto> findByFiltersAndSort(LocalDateTime now, String openProduct, String closedProduct, String keyword,
      ProductStatus cursorStatus, LocalDateTime cursorStartDateTime, Long cursorId, Pageable pageable);

  List<Product> findAllByStatusAndStartDateTime(ProductStatus status, LocalDateTime startDateTime);

  Slice<ProductSummaryDto> findAllProducts(ProductStatus cursorStatus, LocalDateTime cursorStartDateTime, Long cursorId, Pageable pageable);

  Slice<MyProductSummaryDto> findProductByMember(Long memberId, Pageable pageable, Long cursorId);
}
