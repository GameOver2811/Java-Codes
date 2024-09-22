package com.estore.E_Store.Services;

import com.estore.E_Store.Models.BookModel;
import com.estore.E_Store.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepository;

    public String getWelcomeMessage() {
        return "Welcome to the E-Store!";
    }

    public UUID addBook(BookModel book) {
        book.setBookId(UUID.randomUUID());
        bookRepository.save(book);
        return book.getBookId();
    }

    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<BookModel> getBooksByUserId(UUID userId) {
        return bookRepository.findByUserId(userId);
    }

    public BookModel getBookById(UUID id) {
        Optional<BookModel> book = bookRepository.findByBookId(id);
        return book.orElse(null);
    }

    public BookModel updateBook(UUID id, BookModel book) {
        if (bookRepository.existsByBookId(id)) {
            book.setBookId(id);
            return bookRepository.save(book);
        }
        return null;
    }

    public boolean deleteBook(UUID bookId) {
        if (bookRepository.existsByBookId(bookId)) {
            bookRepository.deleteByBookId(bookId);
            return true;
        }
        return false;
    }
}
