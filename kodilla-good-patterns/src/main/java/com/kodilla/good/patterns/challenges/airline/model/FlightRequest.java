package com.kodilla.good.patterns.challenges.airline.model;


public class FlightRequest {

    public String searchedCity(String city){
        return city;
    }

    public Flight searchedFlight(String cityStartFlight, String cityStopFlight, String cityEndFlight){
        return new Flight(cityStartFlight,cityStopFlight,cityEndFlight);
    }
}
