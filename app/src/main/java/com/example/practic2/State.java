package com.example.practic2;

public class State {

    private String name; // название
    private String capital;  // столица
    private String description; // описание при нажатии
    private int flagResource; // ресурс флага

    public State(String name, String capital, String description, int flag){
        this.name=name;
        this.capital=capital;
        this.description=description;
        this.flagResource=flag;
    }

    public String GetDescription(){
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}