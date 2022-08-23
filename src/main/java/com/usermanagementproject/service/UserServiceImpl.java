package com.usermanagementproject.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagementproject.binding.LoginForm;
import com.usermanagementproject.binding.UnlockAccForm;
import com.usermanagementproject.binding.UserForm;
import com.usermanagementproject.constants.AppConstants;
import com.usermanagementproject.model.CityMasterEntity;
import com.usermanagementproject.model.CountryMasterEntity;
import com.usermanagementproject.model.StateMasterEntity;
import com.usermanagementproject.model.UserMasterEntity;
import com.usermanagementproject.props.AppProperties;
import com.usermanagementproject.repository.CityRepository;
import com.usermanagementproject.repository.CountryRepository;
import com.usermanagementproject.repository.StateRepository;
import com.usermanagementproject.repository.UserRepository;
import com.usermanagementproject.util.EmailUtils;

import ch.qos.logback.core.status.Status;

@Service
public class UserServiceImpl implements UserServiceI {

	 @Autowired
	 private UserRepository userRepo;
	 @Autowired
	 private CountryRepository countryRepo;
	 @Autowired
	 private StateRepository stateRepo;
	 @Autowired
	 private CityRepository cityRepo;
	 @Autowired
	 private EmailUtils emailUtils;
	 
	 private AppProperties appProp;
	 
	
	@Override
	public String logincheck(LoginForm loginForm) {
         UserMasterEntity userAcc= userRepo.findByEmailAndPassword(loginForm.getEmail(),loginForm.getPassword());
         
         if (userAcc != null) {
			
        	 String status = userAcc.getAccountStatus();
        	 
        	  if (status.equals(AppConstants.LOCKED)) {
				  return appProp.getMessages().get(AppConstants.ACCOUNT_LOCKED);
			} else {
                  return AppConstants.SUCCESS;
			}
		} else {
                return appProp.getMessages().get(AppConstants.INVALID_CREDENTIALS);
		}
	}

	@Override
	public Map<Integer, String> getContries() {
           List<CountryMasterEntity> findall=countryRepo.findAll();
           Map<Integer, String> countriesmap = new HashMap<>();
           
           findall.forEach(country ->{
        	   countriesmap.put(country.getCountryId(),country.getCountryName());
           });
		return countriesmap;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
        List<StateMasterEntity> findbycountryid= stateRepo.findByCountryId(countryId);
        Map<Integer, String> stateMap = new HashMap<>();
        findbycountryid.forEach(state ->{
        	stateMap.put(state.getStateId(), state.getStateName());
        });
		return stateMap;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
       List<CityMasterEntity> findbystateid= cityRepo.findByStateId(stateId);
       Map<Integer, String> cityMap = new HashMap<>();
       findbystateid.forEach(city -> {
    	   cityMap.put(city.getCityId(), city.getCityName());
       });
       
		return cityMap;
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
