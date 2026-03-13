package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.BookingRepository;
import com.example.UberReviewService.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    public ReviewServices(ReviewRepository reviewRepository,BookingRepository bookingRepository){
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
         System.out.println("****************");
         Review r= Review.builder()
                 .content("amazing ride")
                 .rating(5.0)
                 .build();
//         System.out.println(r);
        Booking b=Booking.builder()
                        .startTime(new Date())
                        .endTime(new Date())
                        .review(r)
                        .build();

//        reviewRepository.save(r);
//        bookingRepository.save(b);

        bookingRepository.deleteById(3L);
//
//         List<Review> reviews=reviewRepository.findAll();
//         for(Review re:reviews){
//             System.out.println(re.getContent());
//         }

//        reviewRepository.deleteById(1L);
    }
}
