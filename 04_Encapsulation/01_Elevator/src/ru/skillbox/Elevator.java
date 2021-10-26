package ru.skillbox;

public class Elevator {

    private int minFloor;

    private int maxFloor;

    public int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.print("Ошибка: Этаж введен не верно! ");
            return;
        }
        if (currentFloor < floor)
            while (currentFloor != floor) {
                moveUp();
                System.out.println("Текущий этаж: " + currentFloor);
            }
        if (currentFloor > floor)
            while (currentFloor != floor) {
                moveDown();
                System.out.println("Текущий этаж: " + currentFloor);
            }
    }

}
