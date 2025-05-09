package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Reservation res1 = new Reservation("king",5,true);
        System.out.println(res1.getPrice());

        Room room = new Room(3,50,false,false);
        if (room.isAvailable()==true){
            System.out.println("Room is available");
        }
        else {
            System.out.println("Room is not available");
        }

        Employee emp1 = new Employee(1234,"Kevin","Front Desk",25,45);
        System.out.println(emp1.getName()+ " earned "+ emp1.totalPay());
    }
}