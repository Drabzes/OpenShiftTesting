package com.example.demo.controller;

import com.example.demo.model.paterns.observer.BinaryObserver;
import com.example.demo.model.paterns.observer.HexaObserver;
import com.example.demo.model.paterns.observer.OctalObserver;
import com.example.demo.model.paterns.observer.Subject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.BinaryOperator;

@Controller
@RequestMapping("/observers")
public class ObserverController {

    @GetMapping()
    public ResponseEntity returnValues() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        return ResponseEntity.ok("");

    }
}
