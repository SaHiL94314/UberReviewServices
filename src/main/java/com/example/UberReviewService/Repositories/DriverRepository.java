package com.example.UberReviewService.Repositories;

import com.example.UberReviewService.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

    List<Driver> findAllByIdIn(List<Long> arrayId);
    Optional<Driver> findByIdAndLicenseNumber(Long id,String license);


    //raw sql query, error is thrown at run time
    @Query(nativeQuery = true,value="Select * from Driver where id=:id and license_number=:license")
    Optional<Driver> rawQueryFindByIdAndLicenseNumber(Long id,String license);

    //hibernate query,error is thrown at compile time
    @Query("Select d from Driver d where d.id=:id and d.licenseNumber=:license")
    Optional<Driver> hqlQueryFindByIdAndLicenseNumber(Long id,String license);



}
