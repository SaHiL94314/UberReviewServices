package com.example.UberReviewService.Repositories;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
//    List<Booking> findAllBookingsByDriverIn(List<Driver> drivers);
//    List<Booking> findAllBookingsByDriverId(Long id);

    @Query("Select r from Booking b inner join Review r on b.review=r where b.id=:b_id")
    Review findReviewByBookingId(Long b_id);
}
