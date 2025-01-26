package com.example.jwt_oauth2_demo.repository;

import com.example.jwt_oauth2_demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
