package com.estore.E_Store.Models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
public class BookModel {
    @Id
    private UUID bookId;
    private UUID userId;
    private String title;
    private String author;
    private String category;
    private BigDecimal price;
    private String publisher;
    private LocalDate publicationDate;
    private String description;
    private String isbn;
    private Integer availableStock;
    private String coverImageUrl;
    private List<Rating> ratings;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rating {
        private UUID userId;
        private Float rating;
        private String review;
        private LocalDate date;
    }
}
