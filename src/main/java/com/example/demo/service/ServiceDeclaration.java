package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Food;
import com.example.demo.entity.Food_Category;
import com.example.demo.entity.Orders;
import com.example.demo.entity.User;

public interface ServiceDeclaration {

	public List<Cart> displayAll(); 
	public List<Cart> displayCart(int id);
	public void deleteAllcarts(int id);
	public void insertion(Cart cart); 
	public void insertionif(int cartid,int uid, int foodid,int quantity); 
	public void updation(Cart cart); 
	public void delete(int id); 

	
	
	public List<Food_Category> displayAlldata(); 
	public void insertionn(Food_Category fc); 
	public void updationn(Food_Category fc); 
	public void deletee(int id);
	public List<Food_Category> searchByName2(String name);

	
	
	public List<Food> displayAlldataa(); 
	public Food getById(int id); 
	public Food findImageById(int id); 
	public void insertion1(Food food); 
	public void updation1(Food food); 
	public void delete1(int id); 
	public List<Food> searchByName1(String name);
	public List<Food> searchByCategName1(int id);
	
	
	public List<Orders> displayAlldataaa();
	public Orders getById1(int id); 
	public void insertion2(Orders ord); 
	public void updation2(Orders ord); 
	public void delete2(int id); 
	
	
	public List<User> displayAlldata1(); 
	public void insertion3(User user); 
	public void updation3(User user);
	public void delete3(int id);
	public int searchByEmail(String email);
	public int searchByPassword(String password);
	public List<User> searchByName(String name);
	public List<User> getuser(int id);
	
	
	
	

}
