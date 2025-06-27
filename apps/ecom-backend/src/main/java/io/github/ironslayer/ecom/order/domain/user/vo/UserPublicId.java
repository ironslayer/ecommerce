package io.github.ironslayer.ecom.order.domain.user.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {

  public UserPublicId {
    Assert.notNull("value", value);
  }
}
