package com.example.handicapCalc.controller;

import com.example.handicapCalc.model.CourseHandicap;
import com.example.handicapCalc.model.CourseHandicapCalculatorParams;
import com.example.handicapCalc.service.CalculatorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    @Qualifier("defaultCalculator")
    private CalculatorService service;

    @PostMapping("/course/handicap/result")
    public CourseHandicap calculateCourseHandicap(@Valid @RequestBody CourseHandicapCalculatorParams params){
        return service.calculateCourseHandicap(params);
    }

    @GetMapping("/course/handicap")
    public ModelAndView getCourseHandicapForm(){
        return new ModelAndView("calculateForm.html");
    }
}
