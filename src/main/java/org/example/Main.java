package org.example;


import org.example.trainees.Trainee;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Trainee nombreTrainee = new Trainee();

        LocalDate timeStartWork = LocalDate.of(2025,06,07);
        LocalDate timeFinishWork = LocalDate.of(2026, 06,07);

        Object ExperienceWork = nombreTrainee.addExperience("globant", "medellin", "colombia",timeStartWork,timeFinishWork,"Trainee");


    }
}