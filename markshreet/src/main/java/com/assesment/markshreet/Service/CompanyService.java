package com.assesment.markshreet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.assesment.markshreet.Entity.Company;
import com.assesment.markshreet.Repository.CompanyRepo;


@Service
public class CompanyService {
    
    @Autowired
    private CompanyRepo comapnyRepo;

    public List<Company> findSuppilers(String location,String natureOfBusiness,
                                        String manufacturingProcesses,Integer pageNumber,Integer pageSize){


        Pageable p = PageRequest.of(pageNumber, pageSize);

        return comapnyRepo.findByLocationAndNatureOfBusinessAndManufacturingProcess(
            location, natureOfBusiness, manufacturingProcesses,p);
    }

}
