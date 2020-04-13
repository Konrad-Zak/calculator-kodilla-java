package com.kodilla.good.patterns.challenges.airline.model;


import java.util.Objects;

public class Flight {

    private String cityStartFlight;
    private String cityStopFlight;
    private String cityEndFlight;

    public Flight(String cityStartFlight, String cityStopFlight, String cityEndFlight) {
        this(cityStartFlight, cityEndFlight);
        this.cityStopFlight = cityStopFlight;
    }

    public Flight(String cityStartFlight, String cityEndFlight) {
        this.cityStartFlight = cityStartFlight;
        this.cityEndFlight = cityEndFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(cityStartFlight, flight.cityStartFlight) &&
                Objects.equals(cityStopFlight, flight.cityStopFlight) &&
                Objects.equals(cityEndFlight, flight.cityEndFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityStartFlight, cityStopFlight, cityEndFlight);
    }

    @Override
    public String toString() {
        nullEliminated();
        return "\nFlight: " +
                "From: " + cityStartFlight +"\t Stopover: " + cityStopFlight + "\t To: " + cityEndFlight;
    }

    public String getCityStartFlight() {
        return cityStartFlight;
    }

    public String getCityStopFlight() {
        return cityStopFlight;
    }

    public String getCityEndFlight() {
        return cityEndFlight;
    }

    private void nullEliminated(){
        if(cityStopFlight == null){
            cityStopFlight = "no exist";
        }
    }

}
