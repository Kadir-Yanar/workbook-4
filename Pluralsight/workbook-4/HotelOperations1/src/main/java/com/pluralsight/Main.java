package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(2,129.99,false,false);
        if(room1.isAvailable()==true) {
            System.out.println("Room is available");
        }
        else {
            System.out.println("Room is not available");
        }
        Reservation reservation = new Reservation("king",5,true);
        System.out.println("Reservation Total " + reservation.getReservationTotal());

        Employee emp1 =new Employee(123,"Jiward Torres","Front Desk",25,50);
        System.out.println(emp1.getName()+ " Earned " + emp1.getTotalPay());
    }
}