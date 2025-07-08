package io.github.ironslayer.ecom.product.domain.aggregate;


import io.github.ironslayer.ecom.product.domain.vo.ProductSize;
import io.github.ironslayer.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}
