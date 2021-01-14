package com.deyevma.springappforentrytask.persistence.repository;

import com.deyevma.springappforentrytask.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUsersById(Long id);
}
