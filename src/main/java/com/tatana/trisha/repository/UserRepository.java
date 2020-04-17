package com.tatana.trisha.repository;

import com.tatana.trisha.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
