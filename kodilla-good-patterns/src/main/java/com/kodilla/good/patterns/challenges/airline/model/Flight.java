package com.kodilla.good.patterns.challenges.airline.model;

import java.util.Objects;

public class Flight {

    private String startFlight;
    private String endFlight;

    public Flight(String startFlight, String endFlight) {
        this.startFlight = startFlight;
        this.endFlight = endFlight;
    }

    public String getStartFlight() {
        return startFlight;
    }

    public String getEndFlight() {
        return endFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startFlight, flight.startFlight) &&
                Objects.equals(endFlight, flight.endFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startFlight, endFlight);
    }

    @Override
    public String toString() {
        return "Flight: " +
                "From: " + startFlight + " To: " + endFlight +"\n";
    }
}
