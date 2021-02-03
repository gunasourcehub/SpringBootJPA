package com.liudonghua.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liudonghua.demo.model.User;
import com.liudonghua.demo.service.UserService;

@RestController
@RequestMapping(value = "/")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = { "/userPartial", "/userPartial/{username}" })
	public List<User> getDBDetails(@PathVariable(name = "inputString", required = false) String inputString) {
		List<User> persistedUsers = null;
		if(inputString != null && !"".equals(inputString)){
			System.out.println("inputString length :: "+inputString.split("_").length); 
			String firstName = inputString.split("_")[0];
			String updatedDate = inputString.split("_")[1];
			String secondName = inputString.split("_")[2];
			
			if(firstName != null && !"".equals(firstName)){
				persistedUsers = userService.getUserFirstNameDetails(firstName);
				if(persistedUsers.size() > 0){
					System.out.println("firstName Record found!");
				}else{
					persistedUsers = userService.getUserSecondNameDetails(secondName);
					if(persistedUsers.size() > 0){
						System.out.println("secondName Record found!");
					}else {
						persistedUsers = userService.getUserUpdatedDateDetails(updatedDate);
						if(persistedUsers.size() > 0){
							System.out.println("updatedDate Record found!");
						}else{
							System.out.println("Record not found!");
						}
					}
				}
			}
			
		}
		return persistedUsers;
	}

}
