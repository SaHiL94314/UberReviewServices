package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{
    ReviewRepository reviewRepository;
    public  ReviewServiceImpl(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }

    @Override
    public Optional<Review> findReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Boolean deleteById(Long id) {
        try{
            reviewRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


}
