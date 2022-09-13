package com.example.di.Interfaces;

public interface IRecipe {
    String name = new String();
    String description = new String();
    int difficulty = 0;

    // Getter
    String getName();
    // Setter
    void setName(String name);

    // Getter
    String getDescription();
    // Setter
    void setDescription(String description);


    // Getter
    float getDifficulty();
    // Setter
    void setDifficulty(int difficulty);

    void display();
}
