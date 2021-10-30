package ru.skillbox;

public class Country {
        private String name;
        private int population;
        private double square;
        private String capitalName;
        private String seaAccess;
        private String title;

    public Country(String name, int population, double square, String capitalName, String seaAccess) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.capitalName = capitalName;
        this.seaAccess = seaAccess;
    }

    public void add(String name, int population, double square, String capitalName, String seaAccess) {
        title = title + "\n" + name + population
                + square + capitalName + seaAccess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getSeaAccess() {
        return seaAccess;
    }

    public void setSeaAccess(String seaAccess) {
        this.seaAccess = seaAccess;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(name + " " + population + " " + "тыс.ч. " + square + " " + "кв.км "
                + capitalName + "\n " + "выход к морю: " + seaAccess);
    }

    }

