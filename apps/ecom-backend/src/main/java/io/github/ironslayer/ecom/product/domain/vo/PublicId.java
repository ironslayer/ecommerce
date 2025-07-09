package io.github.ironslayer.ecom.product.domain.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record PublicId(UUID value) {

  public PublicId {
    Assert.notNull("value", value);
  }
}
