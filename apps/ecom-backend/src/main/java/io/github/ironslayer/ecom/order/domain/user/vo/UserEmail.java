package io.github.ironslayer.ecom.order.domain.user.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record UserEmail(String value) {

  public UserEmail {
    Assert.field("value", value).maxLength(255);
  }
}
