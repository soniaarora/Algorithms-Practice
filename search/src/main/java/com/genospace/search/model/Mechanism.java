package com.genospace.search.model;

public class Mechanism {

    private int id;
    private String name;



    List<Drug> drugs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
