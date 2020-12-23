package com.taxi.service.serrala.model;

public class TravelDetails {

    String source;

    String destination;

    String travellers;

    public TravelDetails(String source, String destination, String travellers) {
        this.source = source;
        this.destination = destination;
        this.travellers = travellers;
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

    public String getTravellers() {
        return travellers;
    }

    public void setTravellers(String travellers) {
        this.travellers = travellers;
    }
}
