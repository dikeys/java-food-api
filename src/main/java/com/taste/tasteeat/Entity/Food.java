package com.taste.tasteeat.Entity;

import javax.persistence.*;

@Entity
@Table(name="indian_food")
public class Food {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "diet")
    private String diet;

    @Column(name = "prep_time")
    private String prep_time;

    @Column(name = "cook_time")
    private String cook_time;

    @Column(name = "flavor_profile")
    private String flavor_profile;

    @Column(name = "course")
    private String course;

    @Column(name = "state")
    private String state;

    @Column(name = "region")
    private String region;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public String getCook_time() {
        return cook_time;
    }

    public void setCook_time(String cook_time) {
        this.cook_time = cook_time;
    }

    public String getFlavor_profile() {
        return flavor_profile;
    }

    public void setFlavor_profile(String flavor_profile) {
        this.flavor_profile = flavor_profile;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }




}
