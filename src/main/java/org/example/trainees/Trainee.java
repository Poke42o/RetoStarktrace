package org.example.trainees;

import java.time.LocalDate;

public class Trainee {

    private String name;
    private String lastName;
    private String softSkill;
    private String hardSkill;
    private Integer timeExperience;
    private String lastEnterprise;
    private LocalDate registrationDate;
    private boolean isActive;

    public Trainee() {
    }

    public Trainee(String name, String lastName, Integer age, String softSkill, String hardSkill, Integer timeExperience, String lastEnterprise, LocalDate registrationDate, boolean isActive) {
        this.name = name;
        this.lastName = lastName;
        this.softSkill = softSkill;
        this.hardSkill = hardSkill;
        this.timeExperience = timeExperience;
        this.lastEnterprise = lastEnterprise;
        this.registrationDate = registrationDate;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }

    public String getHardSkill() {
        return hardSkill;
    }

    public void setHardSkill(String hardSkill) {
        this.hardSkill = hardSkill;
    }

    public Integer getTimeExperience() {
        return timeExperience;
    }

    public void setTimeExperience(Integer timeExperience) {
        this.timeExperience = timeExperience;
    }

    public String getLastEnterprise() {
        return lastEnterprise;
    }

    public void setLastEnterprise(String lastEnterprise) {
        this.lastEnterprise = lastEnterprise;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
