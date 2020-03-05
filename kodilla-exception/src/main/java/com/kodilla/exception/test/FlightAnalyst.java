package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightAnalyst {
    private Map<String,Boolean>flightMap = new HashMap<>();

    public FlightAnalyst() {
        flightMap.put("Denver",true);
        flightMap.put("Oslo",false);
        flightMap.put("Berlin",true);
        flightMap.put("Paris",false);
        flightMap.put("Rome",true);

    }

    public void findFlight(Flight flight) throws RouteNotFoundException{

        String arrivalAirport = flight.getArrivalAirport();

        if (flightMap.containsKey(arrivalAirport)){
             flightMap.entrySet().stream()
                    .filter(t->t.getKey().equals(arrivalAirport))
                    .map(entry -> entry.getKey() + " - includes arrival: " + entry.getValue())
                    .forEach(System.out::println);
        } else {
           throw new  RouteNotFoundException("Airport is not exist!!!");
        }
    }
}
