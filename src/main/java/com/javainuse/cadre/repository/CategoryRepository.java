package com.javainuse.cadre.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javainuse.cadre.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, BigInteger>{

	
	//Category findByCategoryId(BigInteger Id);
	Optional<Category> findByCategoryName(String categoryName);
	Optional<Category> findByid(BigInteger Id);
}
