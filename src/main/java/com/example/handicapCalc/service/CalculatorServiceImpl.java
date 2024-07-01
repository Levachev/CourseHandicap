package com.example.handicapCalc.service;

import com.example.handicapCalc.model.CourseHandicap;
import com.example.handicapCalc.model.CourseHandicapCalculatorParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("defaultCalculator")
public class CalculatorServiceImpl implements CalculatorService {
    @Autowired
    private Function<CourseHandicapCalculatorParams, Double> handicapFormula;

    @Override
    public CourseHandicap calculateCourseHandicap(CourseHandicapCalculatorParams params) {
        return CourseHandicap.builder().value(handicapFormula.apply(params)).build();
    }
}
