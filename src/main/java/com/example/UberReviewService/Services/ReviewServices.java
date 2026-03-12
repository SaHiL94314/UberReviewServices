package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {
    private ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
         System.out.println("****************");
//         Review r= Review.builder()
//                 .content("amazing ride")
//                 .rating(5.0)
//                 .build();
//         System.out.println(r);
//         reviewRepository.save(r);
//
//         List<Review> reviews=reviewRepository.findAll();
//         for(Review re:reviews){
//             System.out.println(re.getContent());
//         }

//        reviewRepository.deleteById(1L);
    }
}
