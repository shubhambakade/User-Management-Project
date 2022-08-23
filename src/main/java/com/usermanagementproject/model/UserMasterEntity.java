package com.usermanagementproject.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "FIRST_NAME")
	private String FirstName;
	
	@Column(name = "LAST_NAME")
	private String LastName;
	
	@Column(name = "USER_EMAIL")
	private String email;
    
    @Column(name = "USER_PHONENO")
	private long phoneNo;
    
    @Column(name = "USER_DOB")
	private Date DOB;
    
    @Column(name = "GENDER_TYPE")
    private String gender;
    
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    
    @Column(name = "STATE_NAME")
    private String stateName;
    
    @Column(name = "CITY_NAME")
    private String cityName;
    
    @Column(name = "ACCOUNT_STATUS")
    private String accountStatus;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "UPDATE_DATE")
    @CreationTimestamp
    private LocalDate updateDate;
    
    @Column(name = "CREATE_DATE")
    @UpdateTimestamp
    private LocalDate createDate;
    
}
