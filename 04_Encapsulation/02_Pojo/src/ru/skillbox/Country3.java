package ru.skillbox;

public class Country3 {
    private String name;
    private int population;
    private double square;
    private String capitalName;
    private boolean hasSeaAccess;
    private String title;

    public Country3(String capitalName, int population) {
        capitalName += "";
        this.population = population;
        this.capitalName = capitalName;

    }

    public Country3(String name, int population, double square, String capitalName, boolean hasSeaAccess) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.capitalName = capitalName;
        this.hasSeaAccess = hasSeaAccess;

    }

    boolean a = false, b = true, c;

    {
        c = a & b;
    }

    public void add(String name, int population, double square, String capitalName) {
        title = title + "\n" + name + population
                + square + capitalName + hasSeaAccess;
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

    public boolean getSeaAccess() {
        return hasSeaAccess;
    }

    public void setSeaAccess(boolean seaAccess) {
        this.hasSeaAccess = seaAccess;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(name + " " + population + " " + "чел. " + square + " " + "кв.км "
                + capitalName + "\n " + "выход к морю: " + hasSeaAccess);
        if (hasSeaAccess = true) {
            System.out.println("Да");
        }

    }
}