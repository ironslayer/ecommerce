package io.github.ironslayer.ecom.order.domain.user.service;


import io.github.ironslayer.ecom.order.domain.user.aggregate.User;
import io.github.ironslayer.ecom.order.domain.user.repository.UserRepository;
import io.github.ironslayer.ecom.order.domain.user.vo.UserEmail;
import io.github.ironslayer.ecom.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public class UserReader {

  private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}
