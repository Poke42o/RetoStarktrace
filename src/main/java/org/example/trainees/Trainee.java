package org.example.trainees;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Trainee extends Experience{

    private String name;
    private String lastName;
    private Integer timeExperience;
    private String lastEnterprise;
    private LocalDate registrationDate;
    private boolean isActive;

    public Trainee() {
    }

    public Trainee(List<String> hardSkill, Map<String, String> lenguage, List<String> softSkill, boolean isActive, String lastEnterprise, String lastName, String name, LocalDate registrationDate, Integer timeExperience) {
        super(hardSkill, lenguage, softSkill);
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

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getLastEnterprise() {
        return lastEnterprise;
    }

    public void setLastEnterprise(String lastEnterprise) {
        this.lastEnterprise = lastEnterprise;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getTimeExperience() {
        return timeExperience;
    }

    public void setTimeExperience(Integer timeExperience) {
        this.timeExperience = timeExperience;
    }

    @Override
    public void skills() {
        System.out.println(this.getHardSkill());
        System.out.println(this.getSoftSkill());
        System.out.println(this.getLenguage());
    }


}
