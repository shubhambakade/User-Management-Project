package com.usermanagementproject.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

	private Integer Id;
	private String firstName;
	private String accountStatus;
	private String lastName;
	private String password;
    private String email;
    private String phoneNo;
    private Date DOB;
    private String gender;
    private String countryName;
    private String stateName;
    private String cityName;
}
