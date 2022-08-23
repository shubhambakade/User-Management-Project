package com.usermanagementproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "STATE_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StateMasterEntity {

	@Id
    @Column(name = "STATE_ID")
	private Integer stateId;
	@Column(name = "STATE_NAME")
	private String stateName;
    @Column(name = "COUNTRY_ID")
    private Integer countryId;
}
