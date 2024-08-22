package com.assesment.markshreet.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assesment.markshreet.Entity.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Long>{
     @Query("SELECT s FROM Company s WHERE s.location = :location AND s.natureOfBusiness = :natureOfBusiness AND s.manufacturingProcesses LIKE %:manufacturingProcess%")
    List<Company> findByLocationAndNatureOfBusinessAndManufacturingProcess(
            @Param("location") String location,
            @Param("natureOfBusiness") String natureOfBusiness,
            @Param("manufacturingProcess") String manufacturingProcess,
            Pageable pageable);
}
