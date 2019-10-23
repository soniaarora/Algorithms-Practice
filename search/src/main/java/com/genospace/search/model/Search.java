package com.genospace.search.model;

import java.util.List;

public class Search {


    private List<Drug> drugs;
    private List<Mechanism> mechanisms;

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public List<Mechanism> getMechanisms() {
        return mechanisms;
    }

    public void setMechanisms(List<Mechanism> mechanisms) {
        this.mechanisms = mechanisms;
    }
}
