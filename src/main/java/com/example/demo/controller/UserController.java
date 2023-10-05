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
import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/FoodApp/rcr1/users")
public class UserController 
{
private ServiceImplementation serimp;
	
    @Autowired
	public UserController (ServiceImplementation serimp) 
    {
		this.serimp = serimp;
	}
	
    @GetMapping("/custums")                     //localhost:8080/users/custums
    public List<User> getAllData()
    {
    	List<User> user=serimp.displayAlldata1();
        return user;
    }
    
    @PostMapping("/custums")                          //localhost:8080/users/custums
    public void insertUser(@RequestBody User user)
    {
    	serimp.insertion3(user);
    }
    
    @PutMapping("/custums")                           //localhost:8080/users/custums
    public void updateUser(@RequestBody User user)
    {
    	serimp.updation3(user);
    }
    @DeleteMapping("/custums/{ID}")
   	public void  deleteUserById(@PathVariable("ID") int id)
       {
       
       	serimp.delete3(id);
       }
   
    
    @GetMapping("/custums1/{name}")
	public List<User> getUserByName(@PathVariable("name") String name) {
		return serimp.searchByName(name);
		}
    @GetMapping("/custums2/{email}")		//localhost:8080/users/custums2
	public int getUserByEmail(@PathVariable("email") String email) {
		return serimp.searchByEmail(email);
		
			}
    @GetMapping("/custums3/{password}")		//localhost:8080/users/custums3
   	public int getUserByPassword(@PathVariable("password") String password) {
   		return serimp.searchByPassword(password);
   		
   			}
    @GetMapping("/custums4/{email}")	//localhost:8080/users/custums4
    public User gettotalDetails(@PathVariable("email") String email) {
    	return serimp.getbyEmail1(email);
    }
    @GetMapping("/custums5/{id}")	//localhost:8080/users/custums4
    public List<User> getuserbyid(@PathVariable("id") int email) {
    	return serimp.getuser(email);
    }
    


}