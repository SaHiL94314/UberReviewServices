package com.example.UberReviewService.Services;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.Repositories.BookingRepository;
import com.example.UberReviewService.Repositories.DriverRepository;
import com.example.UberReviewService.Repositories.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Transactional
public class ReviewServices_deletable implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;
    private DriverRepository driverRepository;
    public ReviewServices_deletable(ReviewRepository reviewRepository, BookingRepository bookingRepository, DriverRepository driverRepository){
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
//        Optional<Driver> d=driverRepository.hqlQueryFindByIdAndLicenseNumber(1l,"dfkj");
//        System.out.println(d.get().getDriverName());

        List<Long> arrayId=new ArrayList<>(Arrays.asList(1L,2L,3L,4L,5L,6L));
        List<Driver> drivers=driverRepository.findAllByIdIn(arrayId);

        for(Driver driver:drivers){
            System.out.println(driver.getBookings().size());
        }

        //        n+1 problem
//        for(Driver driver:drivers){
//            List<Booking> bookingsL=driver.getBookings();
//            for(Booking book:bookingsL){
//                System.out.println(book.getId());
//            }
//        }

        //one way to solve n+1 problem
//        List<Booking> bookingList=bookingRepository.findAllBookingsByDriverIn(drivers);


//        reviewRepository.deleteById(1L);
    }
}
