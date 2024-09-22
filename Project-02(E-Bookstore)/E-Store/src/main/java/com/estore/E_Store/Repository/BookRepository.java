package com.estore.E_Store.Repository;

import com.estore.E_Store.Models.BookModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BookRepository extends MongoRepository<BookModel, UUID> {

    boolean existsByBookId(UUID bookId);
    void deleteByBookId(UUID bookId);
    Optional<BookModel> findByBookId(UUID bookId);
    List<BookModel> findByUserId(UUID userId);

}
