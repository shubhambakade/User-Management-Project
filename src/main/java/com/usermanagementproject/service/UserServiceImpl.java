package com.usermanagementproject.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.usermanagementproject.binding.LoginForm;
import com.usermanagementproject.binding.UnlockAccForm;
import com.usermanagementproject.binding.UserForm;

@Service
public class UserServiceImpl implements UserServiceI {

	@Override
	public String logincheck(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getContries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean emailUnique(String mail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveUser(UserForm userForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unlockAccount(UnlockAccForm unlockAccForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
