package io.github.ironslayer.ecom.order.domain.order.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record OrderPrice(double value) {

  public OrderPrice {
    Assert.field("value", value).strictlyPositive();
  }
}
