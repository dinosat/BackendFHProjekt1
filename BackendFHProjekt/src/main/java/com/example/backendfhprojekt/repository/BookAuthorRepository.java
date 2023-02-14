package com.example.backendfhprojekt.repository;
import com.example.backendfhprojekt.model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {
}
