package com.example.Experience.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Experience.model.CompanyData;

public interface CompanyDatadao extends JpaRepository<CompanyData,Integer> {

}
