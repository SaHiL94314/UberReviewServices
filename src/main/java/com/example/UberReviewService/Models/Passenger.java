package com.example.UberReviewService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Passenger extends BaseModel{
    private String passengerName;

    @OneToMany(mappedBy = "passenger")
    List<Booking> bookings=new ArrayList<>();
}
