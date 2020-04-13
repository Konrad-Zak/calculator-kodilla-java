package com.kodilla.good.patterns.challenges.airline.transport;

import java.util.Set;

public interface TransportConnection {

    Set<Object> findConnectionFrom(String cityStartFlight);
    Set<Object> findConnectionTo(String cityEndFlight);
    Set<Object> findConnectionWithStop(String cityStopFlight);
    Boolean findPreciseConnection(Object object);

}
