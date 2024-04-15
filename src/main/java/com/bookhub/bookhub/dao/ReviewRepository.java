package com.bookhub.bookhub.dao;

import com.bookhub.bookhub.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
