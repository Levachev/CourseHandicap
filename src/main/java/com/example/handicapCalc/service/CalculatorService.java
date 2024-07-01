package com.example.handicapCalc.service;

import com.example.handicapCalc.model.CourseHandicap;
import com.example.handicapCalc.model.CourseHandicapCalculatorParams;

public interface CalculatorService {
    CourseHandicap calculateCourseHandicap(CourseHandicapCalculatorParams params);
}
