package com.example.handicapCalc.model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class CourseHandicapCalculatorParams {
    @DecimalMin("1")
    @DecimalMax("55")
    private double handicapIndex;

    @DecimalMin("20")
    @DecimalMax("90")
    private double courseRating;

    @Min(55)
    @Max(155)
    private int slopeRating;

    @Min(20)
    @Max(90)
    private int par;
}
