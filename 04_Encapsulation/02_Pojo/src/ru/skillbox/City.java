package ru.skillbox;

    public class City {
        private String name;
        private int population;
        private double square;
        private String capitalOfCity;
        private boolean accessToTheSea;
        private String title;

        public City(String name, int population, double square, String capitalOfCity, boolean accessToTheSea, String title) {
            this.name = name;
            this.population = population;
            this.square = square;
            this.capitalOfCity = capitalOfCity;
            this.accessToTheSea = accessToTheSea;
            this.title = title;
        }

        public void add(String name, int population, double square,
                        String capitalOfCity, boolean accessToTheSea, String title) {
            this.title = title + name + " - " + population + "тыс.ч." + " - " + square + "кв.км" + " - "
                    + capitalOfCity + accessToTheSea + title;
        }

        boolean a = false, b = true, c;

        {
            c = a & b;
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

        public String getCapitalOfCity() {
            return capitalOfCity;
        }

        public void setCapitalOfCity(String capitalOfCity) {
            this.capitalOfCity = capitalOfCity;
        }

        public boolean isAccessToTheSea() {
            return accessToTheSea;
        }

        public void setAccessToTheSea(boolean accessToTheSea) {
            this.accessToTheSea = accessToTheSea;
        }

        public boolean hasAccessToTheSea() {
            return hasAccessToTheSea();
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void print() {
            System.out.println(name + " " + population + " " + "тыс.ч. " + square + " " + "кв.км "
                    + capitalOfCity + "\n " + "выход к морю: " + accessToTheSea);
            if (accessToTheSea = !false) {
                System.out.println("Да");
            }
        }
    }
