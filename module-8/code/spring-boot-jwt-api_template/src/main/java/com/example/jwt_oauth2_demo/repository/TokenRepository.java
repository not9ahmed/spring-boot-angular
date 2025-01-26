package com.example.jwt_oauth2_demo.repository;

import com.example.jwt_oauth2_demo.entity.Token;
import com.example.jwt_oauth2_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByToken(String token);
    Optional<List<Token>> findAllByUserAndIsActive(User user, Boolean isActive);
}
