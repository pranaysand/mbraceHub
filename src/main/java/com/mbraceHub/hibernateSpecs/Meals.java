package com.mbraceHub.hibernateSpecs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meals implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String meal_id;
    private String meal;
    private String institution_id;
    private String meal_description;

    public String getMealID() {
        return meal_id;
    }

    public String settMealID() {
        return meal_id;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getInstitutionID() {
        return institution_id;
    }

    public void setInstitutionID(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getMealDescription() {
        return meal_description;
    }

    public void setMealDescription(String meal_description) {
        this.meal_description = meal_description;
    }

}