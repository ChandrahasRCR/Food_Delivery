package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {

	//void findByName(String name);

	@Query(value="select * from user where uname=?1", nativeQuery=true)
	List<User> findByName(String name);

	@Query(value="select uid from user where uemail=?1",nativeQuery=true)
	int findByEmail(String email);
	@Query(value="select * from user where uemail=?1",nativeQuery=true)
	User findByEmail1(String email);
	
	@Query(value="select uid from user where upassword=?1",nativeQuery=true)
	int findByPassword(String password);
	List<User> findByUid(int number);

}
