package com.liudonghua.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudonghua.demo.model.User;
import com.liudonghua.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUserFirstNameDetails(String firstname) {
		return userRepository.getUserByFirstName(firstname);
	}
	
	public List<User> getUserSecondNameDetails(String secondName) {
		return userRepository.getUserBySecondName(secondName);
	}
	
	public List<User> getUserUpdatedDateDetails(String updatedDate) {
		return userRepository.getUserByDate(updatedDate);
	}
}
