package org.example.trainees;

import java.time.LocalDate;
import java.util.List;

public class Trainee extends Experience{

    private String name;
    private String lastName;
    private Integer timeExperience;
    private String lastEnterprise;
    private LocalDate registrationDate;
    private boolean isActive;

    public Trainee() {
    }

    public Trainee(boolean isActive, String lastEnterprise, String lastName, String name, LocalDate registrationDate, Integer timeExperience) {
        this.isActive = isActive;
        this.lastEnterprise = lastEnterprise;
        this.lastName = lastName;
        this.name = name;
        this.registrationDate = registrationDate;
        this.timeExperience = timeExperience;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getLastEnterprise() {
        return lastEnterprise;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Integer getTimeExperience() {
        return timeExperience;
    }

    @Override
    public List<Object> addExperience(String nameEntity, String city, String country, LocalDate startDate, LocalDate finishDate, String PositionOrCualification) {
        return List.of(nameEntity,city,country,startDate,finishDate, PositionOrCualification);
    }

}
