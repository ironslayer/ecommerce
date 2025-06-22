package io.github.ironslayer.ecom.shared.authentication.infrastructure.primary;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class KindeJwtAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken> {

  @Override
  public AbstractAuthenticationToken convert(@NonNull Jwt source) {
    return new JwtAuthenticationToken( source );
  }

}
