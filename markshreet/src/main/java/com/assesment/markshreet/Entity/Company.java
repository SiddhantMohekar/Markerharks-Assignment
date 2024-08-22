package com.assesment.markshreet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long supplier_id;
    private String company_name;
    private String website;
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcesses;

    
    public Company() {
    }


    public Company(long supplier_id, String company_name, String website, String location, String natureOfBusiness,
            String manufacturingProcesses) {
        this.supplier_id = supplier_id;
        this.company_name = company_name;
        this.website = website;
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.manufacturingProcesses = manufacturingProcesses;
    }


    public long getSupplier_id() {
        return supplier_id;
    }


    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }


    public String getCompany_name() {
        return company_name;
    }


    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }


    public String getWebsite() {
        return website;
    }


    public void setWebsite(String website) {
        this.website = website;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }


    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }


    public String getManufacturingProcesses() {
        return manufacturingProcesses;
    }


    public void setManufacturingProcesses(String manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    



}
