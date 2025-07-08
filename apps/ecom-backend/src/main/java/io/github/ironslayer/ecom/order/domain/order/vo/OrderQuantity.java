package io.github.ironslayer.ecom.order.domain.order.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record OrderQuantity(long value) {

  public OrderQuantity {
    Assert.field("value", value).positive();

  }
}
