package com.assesment.markshreet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.markshreet.DTO.CompanyDTO;
import com.assesment.markshreet.Entity.Company;
import com.assesment.markshreet.Service.CompanyService;

@RestController
public class MainController {

    @Autowired
    private CompanyService companyService;
    
    @PostMapping("/query")
    public ResponseEntity<List<Company>> findSup(@RequestBody CompanyDTO company, @RequestParam(value = "pageNumber" ,defaultValue = "0",required = false) Integer page,
        @RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer size){
    try{
    List<Company> supliers = companyService.findSuppilers(company.getLocation(),company.getNatureOfBusiness(), company.getManufacturingProcesses(),page,size);
    return ResponseEntity.ok(supliers);
    }catch(Exception e){
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    }
}
