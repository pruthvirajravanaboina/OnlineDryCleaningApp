package com.odc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odc.model.User;
@Repository
public interface IUserRepository extends JpaRepository<User, String>{

}