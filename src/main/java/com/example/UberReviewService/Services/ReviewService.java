package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Optional<Review> findReviewById(Long id);
    List<Review> findAllReviews();
    Boolean deleteById(Long id);
}
