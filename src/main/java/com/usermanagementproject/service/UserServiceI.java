package com.usermanagementproject.service;

import java.util.Map;

import com.usermanagementproject.binding.LoginForm;
import com.usermanagementproject.binding.UnlockAccForm;
import com.usermanagementproject.binding.UserForm;

public interface UserServiceI {

    public String logincheck(LoginForm loginForm);
	
	public Map<Integer, String> getContries();
	
	public Map<Integer, String> getStates(Integer countryId);
	
	public Map<Integer, String> getCities(Integer stateId);
	
	public boolean emailUnique(String mail);
	
	public boolean saveUser(UserForm userForm);
	
	public boolean unlockAccount(UnlockAccForm unlockAccForm);
	
	public String forgotPassword(String email);
}
