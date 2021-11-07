package ru.skillbox;

public class Delivery {
        Dimensions dimensions;
        private final double weight;
        private final String address;
        private final boolean toFlip;
        private final String regNumber;
        private final boolean fragile;

        public Delivery(double weight, String address, boolean toFlip, String regNumber, boolean fragile) {
                this.weight = 0;
                this.address = "N/A";
                this.toFlip = true;
                this.regNumber = "N/A";
                this.fragile = true;
        }

        public Delivery(double weight, String address, boolean toFlip, String regNumber, boolean fragile, double cargoVolume) {
                this.weight = weight;
                this.address = address;
                this.toFlip = toFlip;
                this.regNumber = regNumber;
                this.fragile = fragile;
        }

        public Delivery setWeight(double weight) {
                return new Delivery(weight, address, toFlip, regNumber, fragile);
        }

        public double getWeight() {
                return weight;
        }

        public Delivery setAddress(String address) {
                return new Delivery(weight, address, toFlip, regNumber, fragile);
        }

        public String getAddress() {
                return address;
        }

        public Delivery setToFlip(boolean toFlip) {
                return new Delivery(weight, address, toFlip, regNumber, fragile);
        }

        public boolean isToFlip() {
                return toFlip;
        }

        public Delivery setRegNumber(String regNumber) {
                return new Delivery(weight, address, toFlip, regNumber, fragile);
        }

        public String getRegNumber() {
                return regNumber;
        }

        public Delivery setFragile(boolean fragile) {
                return new Delivery(weight, address, toFlip, regNumber, fragile);
        }

        public boolean isFragile() {
                return fragile;
        }

        public String toString () {
                return "Вес: " + weight + "\n"
                        + "Адрес: " + address + "\n"
                        + "Можно ли переворачивать? " + toFlip + "\n"
                        + "Регистрационный номер: " + regNumber + "\n"
                        + "Хрупкое? " + fragile;
                }

        }
