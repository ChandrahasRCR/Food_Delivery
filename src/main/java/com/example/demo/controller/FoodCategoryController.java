package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Food;
import com.example.demo.entity.Food_Category;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/FoodApp/rcr1/users")
public class FoodCategoryController 
{
private ServiceImplementation serimp;
	
    @Autowired
	public FoodCategoryController  (ServiceImplementation serimp) 
    {
		this.serimp = serimp;
	}
	
    @GetMapping("/fcs")                //localhost:8080/FoodApp/rcr1/users/fcs
    public List<Food_Category> getAllData()
    {
    	List<Food_Category> fc=serimp.displayAlldata();
        return fc;
    }
    
    @PostMapping("/fcs") 
    public void insertFood_Category(@RequestBody Food_Category fc)
    {
    	serimp.insertionn(fc);
    }
    
    @PutMapping("/fcs")
    public void updateFood_Category(@RequestBody Food_Category fc)
    {
    	serimp.updationn(fc);
    }

    @DeleteMapping("/fcs/{ID}")
  	public void  deleteFoodCategoryById(@PathVariable("ID") int id)
      {
    	
      	serimp.deletee(id);
      }


    @GetMapping("/fcs1/{name}")
   	public List<Food_Category> getFoodCategoryByName(@PathVariable("name") String name) {
   		return serimp.searchByName2(name);
   		
   			}




}
    
