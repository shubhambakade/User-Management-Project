package com.usermanagementproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CITY_MASTER")
public class CityMasterEntity {

	@Id
    @Column(name = "CITY_ID")
	private int cityId;
    @Column(name ="CITY_NAME")
	private String cityName;
    @Column(name = "STATE_ID")
    private Integer stateId;
}
