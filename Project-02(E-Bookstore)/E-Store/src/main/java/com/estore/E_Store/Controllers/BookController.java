package com.estore.E_Store.Controllers;

import com.estore.E_Store.Models.BookModel;
import com.estore.E_Store.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookServices bookServices;

    @GetMapping("/")
    public String welcome() {
        return bookServices.getWelcomeMessage();
    }

    @PostMapping("/add")
    public UUID addBook(@RequestBody BookModel book) {
        return bookServices.addBook(book);
    }

    @GetMapping("/all")
    public List<BookModel> getAllBooks() {
        return bookServices.getAllBooks();
    }

    @GetMapping("/all/{userId}")
    public List<BookModel> getBooksByUserId(@PathVariable UUID userId) {
        return bookServices.getBooksByUserId(userId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookModel> getBookById(@PathVariable UUID id) {
        BookModel book = bookServices.getBookById(id);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BookModel> updateBook(@PathVariable UUID id, @RequestBody BookModel book) {
        BookModel updatedBook = bookServices.updateBook(id, book);
        return updatedBook != null ? ResponseEntity.ok(updatedBook) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable UUID bookId) {
        boolean isDeleted = bookServices.deleteBook(bookId);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
