package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="BookingReview")
public class Review extends BaseModel{


    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Double rating;





    @Override
    public String toString(){
        return "content: "+this.content+" rating: "+this.rating+" createdAt:"+this.createdAt+" updatedAt:"+this.updatedAt;
    }
}
