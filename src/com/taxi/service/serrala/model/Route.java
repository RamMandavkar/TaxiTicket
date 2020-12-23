package com.taxi.service.serrala.model;

public class Route {

    String source;

    String destination;

    String distance;

    public Route(String source, String destination, String distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Route{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
