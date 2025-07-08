package io.github.ironslayer.ecom.product.domain.vo;


import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record ProductPrice(double value) {

  public ProductPrice {
    Assert.field("value", value).min(0.1);
  }
}
