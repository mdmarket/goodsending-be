package com.goodsending.product.dto.response;

import com.goodsending.product.type.ProductStatus;
import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class ProductSummaryDto {

  private Long productId;
  private String name;
  private int price;
  private int finalPrice;
  private LocalDateTime startDateTime;
  private LocalDateTime dynamicEndDateTime;
  private LocalDateTime maxEndDateTime;
  private ProductStatus status;
  private String thumbnailUrl;

  @QueryProjection
  public ProductSummaryDto(Long productId, String name, int price, int finalPrice, LocalDateTime startDateTime, LocalDateTime dynamicEndDateTime,
      LocalDateTime maxEndDateTime, ProductStatus status, String thumbnailUrl) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    this.finalPrice = finalPrice;
    this.startDateTime = startDateTime;
    this.dynamicEndDateTime = dynamicEndDateTime;
    this.maxEndDateTime = maxEndDateTime;
    this.status = status;
    this.thumbnailUrl = thumbnailUrl;
  }

}
