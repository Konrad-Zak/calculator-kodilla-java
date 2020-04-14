package com.kodilla.good.patterns.challenges.airline.model;

import java.util.Objects;

public class Flight {

    private String starFlight;
    private String endFlight;

    public Flight(String starFlight, String endFlight) {
        this.starFlight = starFlight;
        this.endFlight = endFlight;
    }

    public String getStarFlight() {
        return starFlight;
    }

    public String getEndFlight() {
        return endFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(starFlight, flight.starFlight) &&
                Objects.equals(endFlight, flight.endFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starFlight, endFlight);
    }

    @Override
    public String toString() {
        return "Flight: " +
                "From: " + starFlight + " To: " + endFlight +"\n";
    }
}
