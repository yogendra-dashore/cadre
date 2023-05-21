package com.javainuse.cadre.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.cadre.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, BigInteger> {

	Activity findBysubCategoryId(BigInteger subCategoryId);

	Optional<Activity> findByActivityName(String activityName);

	Optional<Activity> findById(BigInteger id);
}
