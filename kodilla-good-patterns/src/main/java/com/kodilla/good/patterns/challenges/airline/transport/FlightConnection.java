package com.kodilla.good.patterns.challenges.airline.transport;

import com.kodilla.good.patterns.challenges.airline.model.Flight;

import java.util.Set;

public interface FlightConnection {

    Set<Flight> findFlightFrom(String startFlight);
    Set<Flight> findFlightTo(String endFlight);
    Set<Set<Flight>> findFlightConnection(Flight flight);
}
