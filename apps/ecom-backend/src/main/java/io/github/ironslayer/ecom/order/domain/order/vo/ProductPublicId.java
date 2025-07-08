package io.github.ironslayer.ecom.order.domain.order.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record ProductPublicId(UUID value) {

  public ProductPublicId {
    Assert.notNull("value", value);
  }
}
