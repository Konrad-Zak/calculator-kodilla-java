package com.kodilla.good.patterns.challenges.airline.service;

import com.kodilla.good.patterns.challenges.airline.transport.TransportConnection;

import java.util.Set;

public class FlightService {

    TransportConnection flightConnection;

    public FlightService(TransportConnection flightConnection) {
        this.flightConnection = flightConnection;
    }

    public void showFlightFrom(String cityStartFlight){
        Set<Object> flights = flightConnection.findConnectionFrom(cityStartFlight);
        System.out.println("\nFlight list from city: " + cityStartFlight + ":\n" + flights);
    }

    public void showFlightTo(String cityEndFlight){
        Set<Object> flights = flightConnection.findConnectionTo(cityEndFlight);
        System.out.println("\nFlight list to city: " + cityEndFlight + ":\n" + flights);
    }

    public void showFlightThrough(String cityStopFlight){
        Set<Object> flights = flightConnection.findConnectionWithStop(cityStopFlight);
        System.out.println("\nFlight list through city: " + cityStopFlight + ":\n" + flights);
    }

    public void checkConnection(Object object){
        boolean isExist = flightConnection.findPreciseConnection(object);
        System.out.println("\nSearched flight: " + object + " Available: " + isExist);
    }

}
