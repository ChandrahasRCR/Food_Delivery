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

import com.example.demo.entity.Cart;
import com.example.demo.entity.Food;
import com.example.demo.service.ServiceImplementation;

@RestController
@RequestMapping("/FoodApp/rcr1/users")
public class CartController 
{
private ServiceImplementation serimp;
	
    @Autowired
	public CartController  (ServiceImplementation serimp) 
    {
		this.serimp = serimp;
	}
	
    @GetMapping("/cartss")              //localhost:8080/FoodApp/rcr1/users/cartss
    public List<Cart> getAllData()
    {
    	List<Cart> cart=serimp.displayAll();
        return cart;
    }   @GetMapping("/cartss/{id}")              //localhost:8080/FoodApp/rcr1/users/cartss/{id}
    public List<Cart> getCartData(@PathVariable("id") int id)
    {
    	List<Cart> cart=serimp.displayCart(id);
    	return cart;
        
    }
    
    @PostMapping("/cartss") 
    public void insertCart(@RequestBody Cart cart)
    {
    	serimp.insertion(cart);
    }
    @PostMapping("/cartss1") 
    public void insertCart1(@RequestBody Cart cart)
    {
    	serimp.insertionif( cart.getCartid(), cart.getUid(),  cart.getFoodid(), cart.getQuantity());
    }
    
    @PutMapping("/cartss")
    public void updateCart(@RequestBody Cart cart)
    {
    	serimp.updation(cart);
    }

    @DeleteMapping("/cartss/{id}")
   	public void  deleteCartById(@PathVariable("id") int id)
       {
       	
       	serimp.delete(id);
    

       }
    @DeleteMapping("/carts/byfood/{id}")                      //localhost:8080/FoodApp/rcr1/users/carts/byfood{id}
   	public void  delcartbyfood(@PathVariable("id") int id)
       {
       	
       	serimp.deleteAllcarts(id);
    

       }
}








    