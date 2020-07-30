package com.speakfun.speakingclub.repo;

import com.speakfun.speakingclub.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}