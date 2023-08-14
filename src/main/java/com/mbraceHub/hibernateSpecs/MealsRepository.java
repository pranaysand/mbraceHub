package com.mbraceHub.hibernateSpecs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MealsRepository extends JpaRepository<Meals, Long> {

}