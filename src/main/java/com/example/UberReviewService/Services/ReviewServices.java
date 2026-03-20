package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.BookingRepository;
import com.example.UberReviewService.Repositories.DriverRepository;
import com.example.UberReviewService.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    private DriverRepository driverRepository;
    public ReviewServices(ReviewRepository reviewRepository,BookingRepository bookingRepository,DriverRepository driverRepository){
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
        this.driverRepository=driverRepository;
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

//        bookingRepository.deleteById(3L);
//
//         List<Review> reviews=reviewRepository.findAll();
//         for(Review re:reviews){
//             System.out.println(re.getContent());
//         }
//        Optional<Driver> driver = driverRepository.findByIdAndLicenseNumber(1L,"dfkj");
//        if(driver.isPresent()){

//            System.out.println(driver.get().getDriverName());
//            List<Booking> bookings=bookingRepository.findAllBookingsByDriverId(1L);

//            List<Booking> bookings=driver.get().getBookings();
//            for(Booking booking:bookings){
//                System.out.println(booking.getId());
//            }
//        }
//        Optional<Driver> d=driverRepository.rawQueryFindByIdAndLicenseNumber(1l,"dfkj");
//        System.out.println(d.get().getDriverName());//
//
        Optional<Driver> d=driverRepository.hqlQueryFindByIdAndLicenseNumber(1l,"dfkj");
        System.out.println(d.get().getDriverName());
//        reviewRepository.deleteById(1L);
    }
}
