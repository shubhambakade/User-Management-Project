package com.usermanagementproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementproject.model.CityMasterEntity;

public interface CityRepository extends JpaRepository<CityMasterEntity, Integer> {

	public List<CityMasterEntity> findByStateId(Integer stateId);

}
