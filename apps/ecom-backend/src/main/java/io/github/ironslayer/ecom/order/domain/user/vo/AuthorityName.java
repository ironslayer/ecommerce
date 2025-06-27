package io.github.ironslayer.ecom.order.domain.user.vo;

import io.github.ironslayer.ecom.shared.error.domain.Assert;

public record AuthorityName(String name ) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }

}
