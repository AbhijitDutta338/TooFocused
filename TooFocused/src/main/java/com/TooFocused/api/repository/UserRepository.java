package com.TooFocused.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TooFocused.api.entity.*;

public interface UserRepository extends JpaRepository<User, Integer> {

}
