package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Food;
import com.example.demo.entity.Food_Category;
import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import com.example.demo.persistance.CartRepository;
import com.example.demo.persistance.FoodCategoryRepository;
import com.example.demo.persistance.FoodRepository;
import com.example.demo.persistance.OrdersRepository;
import com.example.demo.persistance.UserRepository;


@Service
public class ServiceImplementation implements ServiceDeclaration{

	private  CartRepository catrep;
	private  FoodCategoryRepository fcrep;
	private  FoodRepository foodrep;
	private  OrdersRepository ordrep;
	private  UserRepository userep;


	@Autowired
	public ServiceImplementation(CartRepository catrep,FoodCategoryRepository fcrep,FoodRepository foodrep,OrdersRepository ordrep,UserRepository userep) 
	{
		this.catrep =catrep;
		this.fcrep=fcrep;
		this.foodrep =foodrep;
		this.ordrep=ordrep;
		this.userep =userep;
	
	}
	
	//cart methods
	@Override
	@Transactional
	public List<Cart> displayAll() 
	{
		return catrep.findAll();
	}
public List<Cart> displayCart(int id) {
	return catrep.getById11(id);
}
	@Override
	@Transactional
	public void insertion(Cart cart) 
	{
		catrep.save(cart);
	}
	@Override
	@Transactional
	public void insertionif(int cartid,int uid, int foodid,int quantity) 
	{
		catrep.insertIfNotExist( cartid, uid,  foodid, quantity);
	}

	@Override
	@Transactional
	public void updation(Cart cart) 
	{
		catrep.save(cart);
	}

	@Override
	@Transactional
	public void delete(int id) 
	{
		catrep.deleteById(id);
	}
	
	@Transactional
	public void deleteAllcarts(int id) {
		catrep.deleteById(id);
		
	}
	

	
	
	//Food Category methods
	@Override
	@Transactional
	public List<Food_Category> displayAlldata() {
		return fcrep.findAll();
	}

	@Override
	@Transactional
	public void insertionn(Food_Category fc) {
		 fcrep.save(fc);
	}

	@Override
	@Transactional
	public void updationn(Food_Category fc) {
		fcrep.save(fc);
	}

	@Override
	@Transactional
	public void deletee(int id) {
		fcrep.deleteById(id);
	}
	@Override
	@Transactional
	public List<Food_Category> searchByName2(String name) {
		return fcrep.findByName2(name);
		
	}
	
	

//Food methods
	@Override
	@Transactional
	public List<Food> displayAlldataa() {
		return foodrep.findAll();
	}
	
	
	@Override
	@Transactional
	public Food getById(int id) {
		return foodrep.findById(id).get();
		
	}

	@Override
	@Transactional
	public Food findImageById(int id) {
		// TODO Auto-generated method stub
		return foodrep.findImageById(id);
	}

	@Override
	@Transactional
	public void insertion1(Food food) {
		 foodrep.save(food);
	}

	@Override
	@Transactional
	public void updation1(Food food) {
		foodrep.save(food);
	}

	@Override
	@Transactional
	public void delete1(int id) {
		foodrep.deleteById(id);
	}
	

	@Override
	@Transactional
	public List<Food> searchByName1(String name) {
		// TODO Auto-generated method stub
		return  foodrep.findByNameContaining(name);
//		return  foodrep.searchByName(name);
	}
	@Override
	public List<Food> searchByCategName1(int id) {
		// TODO Auto-generated method stub
		return foodrep.findByCateg(id);
	}
	
	
	//orders method
	@Override
	@Transactional
	public List<Orders> displayAlldataaa() {
		return ordrep.findAll();
	
	}
	
	@Override
	@Transactional
	public Orders getById1(int id) {
		return ordrep.findById(id).get();
		
	}
	@Override
	@Transactional
	public void insertion2(Orders ord) {
		ordrep.save(ord);
		
	}
	@Override
	@Transactional
	public void updation2(Orders ord) {
		ordrep.save(ord);
		
	}
	@Override
	@Transactional
	public void delete2(int id) {
		ordrep.deleteById(id);
		
	}

	//user methods
	@Override
	@Transactional
	public List<User> displayAlldata1() {
		return userep.findAll();
	
	}
	@Override
	@Transactional
	public void insertion3(User user) {
		userep.save(user);
		
	}
	@Override
	@Transactional
	public void updation3(User user) {
		userep.save(user);
		
	}
	@Override
	@Transactional
	public void delete3(int id) {
		userep.deleteById(id);
	}
	@Override
	@Transactional
	public  List<User>searchByName(String name) {
		return userep.findByName(name);
		
	}
	

	@Transactional
	public int searchByEmail(String email) {
		// TODO Auto-generated method stub
		return userep.findByEmail(email);
	}


	@Override
	@Transactional
	public int searchByPassword(String password) {
		// TODO Auto-generated method stub
		return userep.findByPassword(password);
	}




	public User getbyEmail1(String email) {
		
		return userep.findByEmail1(email);
	}

	@Override
	public List<User> getuser(int id) {
		// TODO Auto-generated method stub
		return userep.findByUid(id);
	}




	




	




	








	
}

