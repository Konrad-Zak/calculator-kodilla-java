package com.kodilla.good.patterns.challenges.airline.transport;

import com.kodilla.good.patterns.challenges.airline.model.Flight;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightConnection implements TransportConnection {
    private Set<Flight> flights = new HashSet<>();

    public FlightConnection() {
        flights.add(new Flight("Warsaw","Wroclaw"));
        flights.add(new Flight("Cracow","Rzeszow","Poznan"));
        flights.add(new Flight("Torun","Wroclaw"));
        flights.add(new Flight("Warsaw","Cracow"));
        flights.add(new Flight("Cracow","Warsaw"));
        flights.add(new Flight("Poznan","Warsaw","Rzeszow"));
        flights.add(new Flight("Poznan","Wroclaw","Cracow"));
        flights.add(new Flight("Lodz","Torun"));
        flights.add(new Flight("Rzeszow","Warsaw","Poznan"));
    }

    @Override
    public Set<Object> findConnectionFrom(String cityStartFlight) {
         return flights.stream()
                 .filter(flight -> flight.getCityStartFlight().equals(cityStartFlight))
                 .collect(Collectors.toSet());
    }

    @Override
    public Set<Object> findConnectionTo(String cityEndFlight) {
        return flights.stream()
                .filter(flight -> flight.getCityEndFlight().equals(cityEndFlight))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Object> findConnectionWithStop(String cityStopFlight) {
        return flights.stream()
                .filter(flight -> Objects.nonNull(flight.getCityStopFlight()))
                .filter(flight -> flight.getCityStopFlight().equals(cityStopFlight))
                .collect(Collectors.toSet());
    }

    @Override
    public Boolean findPreciseConnection(Object object) {
        Flight flight = (Flight)object;
        return flights.contains(flight);
    }

}
