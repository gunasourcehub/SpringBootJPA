package com.liudonghua.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.liudonghua.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT * FROM USERTABLE WHERE FIRSTNAME = ?1", nativeQuery = true)
	List<User> getUserByFirstName(@Param("firstname") String firstname);

	@Query(value = "SELECT * FROM USERTABLE WHERE SECONDNAME = ?1", nativeQuery = true)
	List<User> getUserBySecondName(@Param("secondname") String secondname);

	@Query(value = "SELECT * FROM USERTABLE WHERE DATE = ?1", nativeQuery = true)
	List<User> getUserByDate(@Param("date") String date);

}
