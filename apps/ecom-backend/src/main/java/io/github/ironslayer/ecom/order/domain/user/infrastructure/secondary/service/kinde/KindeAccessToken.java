package io.github.ironslayer.ecom.order.domain.user.infrastructure.secondary.service.kinde;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KindeAccessToken(@JsonProperty("access_token") String accessToken,
                               @JsonProperty("token_type") String tokenType) {
}
