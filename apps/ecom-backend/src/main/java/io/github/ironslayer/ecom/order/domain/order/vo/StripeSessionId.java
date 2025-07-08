package io.github.ironslayer.ecom.order.domain.order.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

  public StripeSessionId {
    Assert.notNull("value", value);
  }
}
