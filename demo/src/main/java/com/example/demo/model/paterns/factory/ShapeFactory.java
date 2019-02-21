package com.example.demo.model.paterns.factory;

import com.example.demo.model.shapes.shapeInferfaces.Shape;
import com.example.demo.model.shapes.Circle;
import com.example.demo.model.shapes.Rectangle;
import com.example.demo.model.shapes.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType.isEmpty()) {
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
