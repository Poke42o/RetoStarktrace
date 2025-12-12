package org.example.trainees;

import java.time.LocalDate;
import java.util.List;

abstract class Experience {

    private String nameEntity;
    private String city;
    private String country;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String PositionOrCualification; //cambiar

    public Experience() {
    }



    public abstract List<Object> addExperience(String nameEntity, String city, String country, LocalDate startDate, LocalDate finishDate, String PositionOrCualification);
}

   /* private List<String> softSkill;
    private List<String> hardSkill;
    private Map<String, String> lenguage;*/