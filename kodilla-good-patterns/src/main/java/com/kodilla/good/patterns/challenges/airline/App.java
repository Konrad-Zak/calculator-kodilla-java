package com.kodilla.good.patterns.challenges.airline;

import com.kodilla.good.patterns.challenges.airline.model.Flight;
import com.kodilla.good.patterns.challenges.airline.service.FlightService;
import com.kodilla.good.patterns.challenges.airline.transport.FlightList;

public class App {
    public static void main(String[] args) {

        FlightService flightService = new FlightService(new FlightList());

        flightService.showFlightFrom("Cracow");
        flightService.showFlightTo("Poznan");
        flightService.showFlightConnection(new Flight("Warsaw","Poznan"));

    }
}
