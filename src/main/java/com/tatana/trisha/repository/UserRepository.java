package com.tatana.trisha.repository;

import com.tatana.trisha.dto.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
