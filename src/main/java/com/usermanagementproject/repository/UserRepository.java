package com.usermanagementproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementproject.model.UserMasterEntity;

public interface UserRepository extends JpaRepository<UserMasterEntity, Integer>{

    public UserMasterEntity findByEmailAndPassword(String email, String password);
	
	public UserMasterEntity findByEmail(String email);
}
