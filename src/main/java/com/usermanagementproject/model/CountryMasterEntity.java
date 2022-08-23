package com.usermanagementproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COUNTRY_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryMasterEntity {
    
	@Id
	private int countryId;
	private String countryName;
}
