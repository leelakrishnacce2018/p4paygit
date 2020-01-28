package com.example.p4pay.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import com.example.p4pay.model.Role;
import com.example.p4pay.model.RoleName;

/**
 * Created by leelakrishna on 02/08/17.
 */
@Repository
public interface RoleRepository extends RevisionRepository<Role,Long,Integer>, JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
