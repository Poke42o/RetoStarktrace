package org.example.trainees;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Trainee extends Experience{

    private String photo;
    private String name;
    private String lastName;
    private String description;
    private String lastEnterprise;
    private LocalDate registrationDate;
    private List <String> skills;
    private Map <String, String> lenguage;
    private List<String> responsibilities;
    private List<String> tools;
    public Trainee() {
    }

    public Trainee(String photo, String name, String lastName, String description, Integer timeExperience, String lastEnterprise, LocalDate registrationDate, boolean isActive, List<String> skills, Map<String, String> lenguage) {
        this.photo = photo;
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.lastEnterprise = lastEnterprise;
        this.registrationDate = registrationDate;
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


    public String getLastEnterprise() {
        return lastEnterprise;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
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

    public Object addResponsibilities(List<String> list, String... responsibilities){
        for (String responsability : responsibilities){
            list.add(responsability);
        }
        return this.responsibilities = List.of(responsibilities);
    }

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public Object addTools(List<String> list, String... tools){
        for (String tool : tools){
            list.add(tool);
        }
        return this.tools = List.of(tools);
    }

    public List<String> getTools() {
        return tools;
    }


}
