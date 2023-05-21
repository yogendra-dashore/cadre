package com.javainuse.cadre.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.cadre.entity.Activity;
import com.javainuse.cadre.entity.SubCategory;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, BigInteger> {

	Optional<SubCategory> findBySubCategoryName(String subcategoryName);

	Optional<SubCategory> findById(BigInteger SubCategory);
}
