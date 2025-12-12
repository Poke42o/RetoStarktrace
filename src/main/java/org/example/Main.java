package org.example;


import org.example.trainees.Trainee;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> responsibilities = new ArrayList<>();
        Trainee nombreTrainee = new Trainee();
        LocalDate registrationDate = LocalDate.of(2025, 05,03);
        LocalDate timeStartWork = LocalDate.of(2025,06,07);
        LocalDate timeFinishWork = LocalDate.of(2026, 06,07);
        nombreTrainee.addResponsibilities(responsibilities,"hola","si","esta");
        System.out.println(nombreTrainee.getResponsibilities());
        Object ExperienceWork = nombreTrainee.addExperience("globant", "medellin", "colombia",timeStartWork,timeFinishWork,"Trainee");


    }
}