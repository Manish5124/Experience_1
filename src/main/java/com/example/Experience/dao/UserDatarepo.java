package com.example.Experience.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Experience.model.UserData;

public interface UserDatarepo extends JpaRepository<UserData,Integer> {

}
