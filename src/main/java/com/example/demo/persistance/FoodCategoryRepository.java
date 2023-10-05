package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Food;
import com.example.demo.entity.Food_Category;

public interface FoodCategoryRepository extends JpaRepositoryImplementation<Food_Category, Integer> {

	//Food_Category findByName2(String name);

	@Query(value="select * from food_category where fcname=?1", nativeQuery=true)
	List<Food_Category> findByName2(String fcname);
	





}
