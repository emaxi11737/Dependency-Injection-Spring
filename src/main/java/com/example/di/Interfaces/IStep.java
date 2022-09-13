package com.example.di.Interfaces;

public interface IStep {
    String description = new String();
    int order = 0;

    // Getter
    String getDescription();
    // Setter
    void setDescription(String description);


    // Getter
    int getOrder();
    // Setter
    void setOrder(int order);

}
