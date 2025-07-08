package io.github.ironslayer.ecom.order.domain.order.aggregate;

import io.github.ironslayer.ecom.order.domain.order.vo.OrderQuantity;
import io.github.ironslayer.ecom.order.domain.order.vo.ProductPublicId;
import org.jilt.Builder;

@Builder
public record OrderProductQuantity(OrderQuantity quantity, ProductPublicId productPublicId) {
}
