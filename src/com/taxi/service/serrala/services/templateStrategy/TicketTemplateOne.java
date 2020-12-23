package com.taxi.service.serrala.services.templateStrategy;

import com.taxi.service.serrala.TaxiServiceApplication;
import com.taxi.service.serrala.model.Route;
import com.taxi.service.serrala.model.TravelDetails;

public class TicketTemplateOne implements TaxiTicket {

    @Override
    public void doPrintTicket(TravelDetails td, int travelCost) {
        Route r = TaxiServiceApplication.routes.get(td.getSource().concat("|").concat(td.getDestination()));
        System.out.println("Taxi Ticket ");
        System.out.println("-----------");
        System.out.println("Source: " + r.getSource());
        System.out.println("Destination: " + r.getDestination());
        System.out.println("Kms: " + r.getDistance());
        System.out.println("No. of travellers = " + td.getTravellers());
        System.out.println("Total = " + travelCost + " INR");
    }
}
