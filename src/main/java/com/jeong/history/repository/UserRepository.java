package com.jeong.history.repository;

import com.jeong.history.api.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
