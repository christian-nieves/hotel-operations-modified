package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
        } else {
            System.out.println("Sorry this room is not available.");
        }

    }

    public void checkOut() {
        if (isOccupied()) {
            isOccupied = false;
        } else {
            System.out.println("This room is not occupied.");
        }
    }

    public void cleanRoom() {
        if (isDirty()) {
            isDirty = false;
        } else {
            System.out.println("This room is clean.");
        }
    }


}