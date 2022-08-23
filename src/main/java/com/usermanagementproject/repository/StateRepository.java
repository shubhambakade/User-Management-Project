package com.usermanagementproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementproject.model.StateMasterEntity;

public interface StateRepository extends JpaRepository<StateMasterEntity, Integer> {

	public List<StateMasterEntity> findByCountryId(Integer countryId);

}
