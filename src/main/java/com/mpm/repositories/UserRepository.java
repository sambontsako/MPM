package com.mpm.repositories;

import com.mpm.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User WHERE u.email = ?1")
    Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User WHERE u.first_name = :first_name")
    List<User> findByFirstName(@Param("first_name") String firstName);
}
