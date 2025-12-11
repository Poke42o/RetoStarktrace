package org.example.trainees;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

abstract class Experience {

    private String nameEnterprice;
    private String city;
    private String country;
    private LocalDate entryDate;
    private LocalDate finishDate;
    private String cargo; //cambiar
    private List <String> responsability;
    private List <String> toolsUsed;

    public Experience(String nameEnterprice, String city, String country, LocalDate entryDate, LocalDate finishDate, String cargo, List<String> responsability, List<String> toolsUsed) {
        this.nameEnterprice = nameEnterprice;
        this.city = city;
        this.country = country;
        this.entryDate = entryDate;
        this.finishDate = finishDate;
        this.cargo = cargo;
        this.responsability = responsability;
        this.toolsUsed = toolsUsed;
    }

    public Experience() {
    }



    public abstract void skills();

}

   /* private List<String> softSkill;
    private List<String> hardSkill;
    private Map<String, String> lenguage;*/