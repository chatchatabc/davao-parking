package com.chatchatabc.parking.domain.repository;

import com.chatchatabc.parking.domain.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User repository
 *
 * @author jackie
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
