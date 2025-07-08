package io.github.ironslayer.ecom.order.domain.order.aggregate;

import io.github.ironslayer.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
