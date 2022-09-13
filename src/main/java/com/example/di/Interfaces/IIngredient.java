package com.example.di.Interfaces;

public interface IIngredient {
    String name = new String();
    String description = new String();
    float amount = 0;
    String unit = new String();


    // Getter
     String getName();
    // Setter
     void setName(String name);


    // Getter
    String getDescription();
    // Setter
    void setDescription(String description);


    // Getter
    float getAmount();
    // Setter
    void setAmount(float amount);

    // Getter
    String getUnit();
    // Setter
    void setUnit(String unit);
}
