package com.usermanagementproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementproject.model.CountryMasterEntity;

public interface CountryRepository extends JpaRepository<CountryMasterEntity, Integer> {

}
