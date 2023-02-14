package com.example.backendfhprojekt.controller;

import com.example.backendfhprojekt.model.BookAuthor;
import com.example.backendfhprojekt.service.BookAuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/bookAuthor")
public class BookAuthorController {
    private final BookAuthorService bookAuthorService;

    public BookAuthorController(BookAuthorService bookAuthorService) {
        this.bookAuthorService = bookAuthorService;
    }

    @GetMapping
    public List<BookAuthor> getAllBookAuthors() {
        return bookAuthorService.getAllBookAuthors();
    }

    @GetMapping("/{bookAuthorId}")
    public Optional<BookAuthor> getBookAuthorById(@PathVariable Long bookAuthorId) {
        return bookAuthorService.getBookAuthorById(bookAuthorId);
    }

    @PostMapping
    public BookAuthor createCategory(@RequestBody BookAuthor bookAuthor) {
        return bookAuthorService.createCategory(bookAuthor);
    }

    @PutMapping("/{bookAuthorId}")
    public BookAuthor updateBookAuthor(@PathVariable Long bookAuthorId, @RequestBody BookAuthor bookAuthorDetails) {
        return bookAuthorService.updateBookAuthor(bookAuthorId, bookAuthorDetails);
    }

    @DeleteMapping("/{bookAuthorId}")
    public void deleteBookAuthorById( @PathVariable Long bookAuthorId) {
        bookAuthorService.deleteBookAuthorById(bookAuthorId);
    }
}
