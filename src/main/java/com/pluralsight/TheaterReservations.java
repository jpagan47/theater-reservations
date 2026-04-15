package com.pluralsight;

public class TheaterReservations {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        System.out.println("What date is your show?(MM/dd/yyyy)");
        System.out.println("How many tickets would you need?");

        String userName = "Jose Pagan";
        String dateOfShow = "01/01/2027";
        int numberOfTickets = 2;

        String[] split = userName.split("");
        String firstName = split[1];
        String lastName = split[2];

        System.out.println(numberOfTickets + "ticket"+ "reserved for " + dateOfShow + " for " + lastName + "," + firstName);


    }

}
