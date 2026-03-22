package com.example.UberReviewService.Repositories;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findAllBookingsByDriverIn(List<Driver> drivers);
    List<Booking> findAllBookingsByDriverId(Long id);
}
