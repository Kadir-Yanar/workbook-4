package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {

        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {

        return isWeekend;
    }

    public void setWeekend(boolean weekend) {

        this.isWeekend = weekend;
    }
    public double getPrice() {
        double price = 0;
        if (roomType.equals("king")) {
            price = 139.00;
        } else if (roomType.equals("double")) {
            price = 124.00;
        }

        if (isWeekend) {
            price *= 1.10; // 10% increase
        }

        return price;
    }
}