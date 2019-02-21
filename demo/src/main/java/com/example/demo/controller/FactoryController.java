package com.example.demo.controller;

import com.example.demo.model.paterns.factory.ShapeFactory;
import com.example.demo.model.shapes.shapeInferfaces.Shape;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FactoryController {

    private com.example.demo.model.paterns.factory.FactoryController factoryController;

    @GetMapping(value = "/factory/demo")
    public ResponseEntity drawShapes() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();

        return ResponseEntity.ok("Rwar");
    }
}
