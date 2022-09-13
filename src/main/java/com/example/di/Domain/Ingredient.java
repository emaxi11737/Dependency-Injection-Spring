package com.example.di.Domain;

import com.example.di.Interfaces.*;

public class Ingredient implements IIngredient {
    private String name;
    private String description;
    private float amount;

    private String unit;

    public Ingredient(String name, String description, float amount, String unit){
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public float getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(float amount) {
    this.amount = amount;
    }

    @Override
    public String getUnit() {
        return this.unit;
    }

    @Override
    public void setUnit(String unit) {
    this.unit = unit;
    }
}
