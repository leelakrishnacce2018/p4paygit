package com.example.p4pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import com.example.p4pay.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by leelakrishna on 02/08/17.
 */
@Repository
public interface UserRepository extends RevisionRepository<User,Long,Integer>,JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
