package com.example.di.Domain;
import com.example.di.Interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Recipe implements IRecipe {
    private String name;
    private String description;
    private int difficulty;

    private List<IStep> steps;

    private List<IIngredient> ingredients;


    public Recipe(String name, String description, int difficulty,List<IStep> steps, List<IIngredient> ingredients) {
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.steps = steps;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return this.name;
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
    public float getDifficulty() {
        return this.difficulty;
    }

    @Override
    public void setDifficulty(int difficulty) {
    this.difficulty = difficulty;
    }

    @Override
    public void display() {
        System.out.println("Nombre:" + this.name);
        System.out.println("Descripcion:" + this.description);
        System.out.println("Dificultad:" + this.difficulty);

        int index = 1;
        for (IIngredient ingredient : ingredients) {
            System.out.println("----------------------");
            System.out.println("Ingrediente Nº" + (int)index++);
            System.out.println("Nombre:" + ingredient.getName());
            System.out.println("Descripcion:" + ingredient.getDescription());
            System.out.println("Cantidad:" + ingredient.getAmount());
            System.out.println("Unidad:" + ingredient.getUnit());
            System.out.println("----------------------");

        }

        for (IStep step : steps) {
            System.out.println("----------------------");
            System.out.println("Paso Nº" + step.getOrder());
            System.out.println(step.getDescription());
            System.out.println("----------------------");
        }

    }

}
