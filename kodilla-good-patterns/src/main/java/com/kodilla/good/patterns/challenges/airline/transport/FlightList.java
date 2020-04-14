package com.kodilla.good.patterns.challenges.airline.transport;

import com.kodilla.good.patterns.challenges.airline.model.Flight;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightList implements FlightConnection{
    private Set<Flight> flights = new HashSet<>();

    public FlightList() {
        flights.add(new Flight("Warsaw","Wroclaw"));
        flights.add(new Flight("Cracow","Poznan"));
        flights.add(new Flight("Torun","Wroclaw"));
        flights.add(new Flight("Warsaw","Cracow"));
        flights.add(new Flight("Cracow","Warsaw"));
        flights.add(new Flight("Poznan","Rzeszow"));
        flights.add(new Flight("Poznan","Cracow"));
        flights.add(new Flight("Lodz","Torun"));
        flights.add(new Flight("Rzeszow","Poznan"));
        flights.add(new Flight("Warsaw","Poznan"));
        flights.add(new Flight("Wroclaw","Poznan"));
    }

    @Override
    public Set<Flight> findFlightFrom(String startFlight) {
        return flights.stream()
                .filter(flight -> flight.getStarFlight().equals(startFlight))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Flight> findFlightTo(String endFlight) {
        return flights.stream()
                .filter(flight -> flight.getEndFlight().equals(endFlight))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Set<Flight>> findFlightConnection(Flight flight) {
        Set<Set<Flight>> flightsList = new HashSet<>();
        Set<Flight>startList = findFlightFrom(flight.getStarFlight());

        if(flights.contains(flight)){
            flightsList.add(new HashSet<>(Collections.singletonList(flight)));
        }

        startList.forEach(f->{
                    Flight flight1 = new Flight(f.getEndFlight(),flight.getEndFlight());
                    if(flights.contains(flight1)){
                        flightsList.add(new HashSet<>(Arrays.asList(f,flight1)));
                    }
                });

        return flightsList;
    }

}
