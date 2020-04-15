package com.kodilla.good.patterns.challenges.airline.service;

import com.kodilla.good.patterns.challenges.airline.model.Flight;
import com.kodilla.good.patterns.challenges.airline.transport.FlightConnection;

import java.util.Set;

public class FlightService {

    private FlightConnection flightConnection;

    public FlightService(FlightConnection flightConnection) {
        this.flightConnection = flightConnection;
    }


    public void showFlightFrom(String startFlight){
        Set<Flight> flights = flightConnection.findFlightFrom(startFlight);
        System.out.println("\nFlight list from city: " + startFlight + ":\n" + flights);
    }

    public void showFlightTo(String endFlight){
        Set<Flight> flights = flightConnection.findFlightTo(endFlight);
        System.out.println("\nFlight list to city: " + endFlight + ":\n" + flights);
    }

    public void showFlightConnection(Flight flight){
        Set<Set<Flight>> flightsResult = flightConnection.findFlightConnection(flight);
        System.out.println("\n" + flight + " available: \n");
        flightsResult.forEach(System.out::println);
    }


}
