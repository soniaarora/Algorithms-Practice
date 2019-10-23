package com.genospace.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Drug {
    @JsonProperty("id")
    private int id;

    private String mainName;
    private List<String> namesCodes;
    private List<String> namesGenerics;
    private List<Mechanism> mechanisms;
    private List<String> namesBrands;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public List<String> getNamesCodes() {
        return namesCodes;
    }

    public void setNamesCodes(List<String> namesCodes) {
        this.namesCodes = namesCodes;
    }

    public List<String> getNamesGenerics() {
        return namesGenerics;
    }

    public void setNamesGenerics(List<String> namesGenerics) {
        this.namesGenerics = namesGenerics;
    }

    public List<Mechanism> getMechanisms() {
        return mechanisms;
    }

    public void setMechanisms(List<Mechanism> mechanisms) {
        this.mechanisms = mechanisms;
    }

    public List<String> getNamesBrands() {
        return namesBrands;
    }

    public void setNamesBrands(List<String> namesBrands) {
        this.namesBrands = namesBrands;
    }
}
