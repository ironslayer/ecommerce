package io.github.ironslayer.ecom.product.domain.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record ProductBrand(String value) {

  public ProductBrand {
    Assert.field("value", value).notNull().minLength(3);
  }
}
