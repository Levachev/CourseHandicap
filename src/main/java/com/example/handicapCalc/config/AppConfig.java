package com.example.handicapCalc.config;

import com.example.handicapCalc.model.CourseHandicapCalculatorParams;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class AppConfig {
    @Bean
    Function<CourseHandicapCalculatorParams, Double> courseHandicapFormula(){
        return (params -> Math.abs(params.getHandicapIndex() * ((double)params.getSlopeRating() / 113d)
                + (params.getCourseRating() - (double)params.getPar())));
    }
}
