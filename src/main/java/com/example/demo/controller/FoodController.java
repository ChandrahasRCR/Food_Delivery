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
import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/FoodApp/rcr1/users")
public class FoodController 
{
private ServiceImplementation serimp;
	
    @Autowired
	public FoodController  (ServiceImplementation serimp) 
    {
		this.serimp = serimp;
	}
	
    @GetMapping("/foods")       //localhost:8080/FoodApp/rcr1/users/foods
    public List<Food> getAllData()
    {
    	List<Food> food=serimp.displayAlldataa();
        return food;
    }
    
    @GetMapping("/foods/{id}") //localhost:8080/FoodApp/rcr1/users/foods/{id}
    public Food getFood(@PathVariable("id") int id)
    {
    	Food food= serimp.getById(id);
    	if(food==null)
    		throw new RuntimeException(" This Food item is not Available");
     return food;
    }
    @GetMapping("/foodsimage/{id}") //localhost:8080/FoodApp/rcr1/users/foodsimage/{id}
    public Food getFoodImageById(@PathVariable("id") int id)
    {
    	Food food= serimp.findImageById(id);
     return food;
    }
    
    
    
    
    @PostMapping("/foods") 
    public void insertFood(@RequestBody Food food)
    {
    	serimp.insertion1(food);
    }
    
    @PutMapping("/foods")
    public void updateFood(@RequestBody Food food)
    {
    	serimp.updation1(food);
    }

    @DeleteMapping("/foods/{ID}")
	public void  deleteFoodById(@PathVariable("ID") int id)
    {
    	Food food=serimp.getById(id);
    	if(food==null)
    		throw new RuntimeException("Id not found");
    	serimp.delete1(id);
    }

    
    @GetMapping("/foods1/{name}")
   	public List<Food> getFoodByName(@PathVariable("name") String name) {
   		return serimp.searchByName1(name);
   			}
    @GetMapping("/foods1/category/{name}")//localhost:8080/FoodApp/rcr1/users/foods1/category/{id}
   	public List<Food> getFoodCategoryByName(@PathVariable("name") int name) {
   		return serimp.searchByCategName1(name);
   		
   			}
    



}
    