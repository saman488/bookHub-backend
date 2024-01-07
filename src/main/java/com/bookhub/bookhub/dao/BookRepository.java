package com.bookhub.bookhub.dao;

import com.bookhub.bookhub.entiry.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
