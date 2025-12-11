package org.example.trainees;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ExperienceEducation extends Experience{

    public ExperienceEducation(String nameEnterprice, String city, String country, LocalDate entryDate, LocalDate finishDate, String cargo, List<String> responsability, List<String> toolsUsed) {
        super(nameEnterprice, city, country, entryDate, finishDate, cargo, responsability, toolsUsed);
    }

    @Override
    public void skills() {

    }
}
