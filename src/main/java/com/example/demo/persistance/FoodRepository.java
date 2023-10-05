package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Food;
import com.example.demo.entity.User;

public interface FoodRepository extends JpaRepositoryImplementation<Food, Integer> {

	//Food findByName(String name);
	@Query(value="select * from food where name=?1", nativeQuery=true)
	List<Food> findByName1(String name);
	@Query(value="select * from food where fcid=?1", nativeQuery=true)
	List<Food> findByCateg(int id);
	@Query(value="select image from food where foodid=?1", nativeQuery=true)
	Food findImageById(int id);
	List<Food> findByNameContaining(String name);
	List<Food> searchByName(String name);

}
