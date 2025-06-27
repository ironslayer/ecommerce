package io.github.ironslayer.ecom.order.domain.user.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record UserLastname(String value) {

  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
