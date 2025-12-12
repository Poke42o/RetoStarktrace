package org.example.trainees;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Trainee extends Experience{

    private String photo;
    private String name;
    private String lastName;
    private String description;
    private Integer timeExperience;
    private String lastEnterprise;
    private LocalDate registrationDate;
    private boolean isActive;
    private List <String> skills;
    private Map <String, String> lenguage;

    public Trainee() {
    }

    public Trainee(String photo, String name, String lastName, String description, Integer timeExperience, String lastEnterprise, LocalDate registrationDate, boolean isActive, List<String> skills, Map<String, String> lenguage) {
        this.photo = photo;
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.timeExperience = timeExperience;
        this.lastEnterprise = lastEnterprise;
        this.registrationDate = registrationDate;
        this.isActive = isActive;
        this.skills = skills;
        this.lenguage = lenguage;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public Integer getTimeExperience() {
        return timeExperience;
    }

    public String getLastEnterprise() {
        return lastEnterprise;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Map<String, String> getLenguage() {
        return lenguage;
    }

    @Override
    public List<Object> addExperience(String nameEntity, String city, String country, LocalDate startDate, LocalDate finishDate, String PositionOrCualification) {
        return List.of(nameEntity,city,country,startDate,finishDate, PositionOrCualification);
    }

}
