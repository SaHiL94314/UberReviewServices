package com.example.UberReviewService.Repositories;

import com.example.UberReviewService.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    Integer countAllByRatingIsLessThanEqual(Integer rating);
    List<Review> findAllByRatingIsLessThanEqual(Integer rating);
    List<Review> findAllByCreatedAtBefore(Date date);
}
