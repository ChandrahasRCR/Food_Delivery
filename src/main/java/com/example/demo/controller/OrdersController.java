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
import com.example.demo.entity.Orders;
import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/FoodApp/rcr1/users")
public class OrdersController 
{
private ServiceImplementation serimp;
	
    @Autowired
	public OrdersController  (ServiceImplementation serimp) 
    {
		this.serimp = serimp;
	}
	
    @GetMapping("/orderss")                         //localhost:8080/users/orderss
    public List<Orders> getAllData()
    {
    	List<Orders> orders=serimp.displayAlldataaa();
        return orders;
    }
    @GetMapping("/orderss/{oid}")                  //localhost:8080/users/orderss/{id}
    public Orders getEmployee(@PathVariable("oid") int id)
    {
    	
    	Orders orders= serimp.getById1(id);
    	if(orders==null)
    		throw new RuntimeException(" This order id is not found");
     return orders;
    }
    
    
    
    
    @PostMapping("/orderss") 
    public void insertOrders(@RequestBody Orders orders)
    {
    	serimp.insertion2(orders);
    }
    
    @PutMapping("/orderss")
    public void updateOrders(@RequestBody Orders orders)
    {
    	serimp.updation2(orders);
    }
    @DeleteMapping("/orderss/{ID}")
   	public void  deleteOrdersById(@PathVariable("ID") int id)
       {
    	
       	serimp.delete2(id);
       }




}
    
