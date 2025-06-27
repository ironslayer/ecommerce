package io.github.ironslayer.ecom.order.domain.user.repository;

import io.github.ironslayer.ecom.order.domain.user.aggregate.User;
import io.github.ironslayer.ecom.order.domain.user.vo.UserAddressToUpdate;
import io.github.ironslayer.ecom.order.domain.user.vo.UserEmail;
import io.github.ironslayer.ecom.order.domain.user.vo.UserPublicId;

import java.util.Optional;

public interface UserRepository {

  void save(User user);

  Optional<User> get(UserPublicId userPublicId);

  Optional<User> getOneByEmail(UserEmail userEmail);

  void updateAddress(UserPublicId userPublicId, UserAddressToUpdate userAddress);

}
