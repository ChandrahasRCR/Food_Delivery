package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Cart;

public interface CartRepository extends JpaRepositoryImplementation<Cart, Integer> {


	@Query(value="select * from cart where uid=?1", nativeQuery=true)
	List<Cart> getById11(int uid);
	
	@Query(value="delete from cart where foodid=?1", nativeQuery=true)
	Cart deleteAllcarts(int foodid);
//	@Query(value ="insert into cart (cartid,uid,foodid,quantity)  select ?1,?2,?3,?4 from dual "
//			+ "where (select 1 from cart where cartid=?1 and foodid=?3)",nativeQuery = true)
	@Query(value="insert into cart(cartid,uid,foodid,quantity) values (?1,?2,?3,?4) on duplicate key update quantity= quantity+1;", nativeQuery=true)
	void insertIfNotExist(int cartid,int uid, int foodid,int quantity);

	
	
	
}
