package com.example.demo.model.shapes;

import com.example.demo.model.shapes.shapeInferfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
