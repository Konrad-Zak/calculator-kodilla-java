package com.kodilla.exception.test;

public class FlightAnalystApp {
    public static void main(String[] args) {

        Flight flight = new Flight("Denver","Rome");
        Flight flight1 = new Flight("Barcelona", "Oslo");
        Flight flight2 = new Flight("New York", "Monaco");

        FlightAnalyst flightAnalyst = new  FlightAnalyst();

        try {

           flightAnalyst.findFlight(flight);
           flightAnalyst.findFlight(flight1);
           flightAnalyst.findFlight(flight2);

        }catch (RouteNotFoundException r){

            System.err.println("You put wrong airport to search... ");

        }finally {

            System.out.println("Do not worry... we can help You :D");
        }
    }
}
