package com.rsys.orderMang.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsys.orderMang.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> getAllByproId(int proId);
	Optional<Product> findByproName(String name);

}
