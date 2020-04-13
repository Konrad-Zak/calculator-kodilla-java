package com.kodilla.good.patterns.challenges.airline;

import com.kodilla.good.patterns.challenges.airline.model.FlightRequest;
import com.kodilla.good.patterns.challenges.airline.service.FlightService;
import com.kodilla.good.patterns.challenges.airline.transport.FlightConnection;

public class App {
    public static void main(String[] args) {

        FlightRequest flightRequest = new FlightRequest();
        FlightService flightService = new FlightService(new FlightConnection());


        flightService.showFlightFrom(flightRequest.searchedCity("Cracow"));
        flightService.showFlightTo(flightRequest.searchedCity("Poznan"));
        flightService.showFlightThrough(flightRequest.searchedCity("Warsaw"));
        flightService.checkConnection(flightRequest.searchedFlight("Poznan",
                "Warsaw","Rzeszow"));
    }
}
