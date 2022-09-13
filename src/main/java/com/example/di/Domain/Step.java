package com.example.di.Domain;

import com.example.di.Interfaces.*;

public class Step implements IStep {
    private String description;
    private int order;

    public Step(String description, int order){
        this.description = description;
        this.order = order;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public void setOrder(int order) {
        this.order = order;
    }
}
