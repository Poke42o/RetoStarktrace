package org.example.trainees;

import java.util.List;
import java.util.Map;

abstract class Experience {
    private List<String> softSkill;
    private List<String> hardSkill;
    private Map<String, String> lenguage;

    public Experience() {
    }

    public Experience(List<String> hardSkill, Map<String, String> lenguage, List<String> softSkill) {
        this.hardSkill = hardSkill;
        this.lenguage = lenguage;
        this.softSkill = softSkill;
    }

    public List<String> getHardSkill() {
        return hardSkill;
    }

    public void setHardSkill(List<String> hardSkill) {
        this.hardSkill = hardSkill;
    }

    public Map<String, String> getLenguage() {
        return lenguage;
    }

    public void setLenguage(Map<String, String> lenguage) {
        this.lenguage = lenguage;
    }

    public List<String> getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(List<String> softSkill) {
        this.softSkill = softSkill;
    }

    public abstract void skills();

}
