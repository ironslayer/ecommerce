package io.github.ironslayer.ecom.order.infrastructure.secondary.repository;

import io.github.ironslayer.ecom.order.infrastructure.secondary.entity.OrderedProductEntity;
import io.github.ironslayer.ecom.order.infrastructure.secondary.entity.OrderedProductEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
