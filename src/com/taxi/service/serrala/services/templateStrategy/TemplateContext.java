package com.taxi.service.serrala.services.templateStrategy;

import com.taxi.service.serrala.model.TravelDetails;

public class TemplateContext {

    private TaxiTicket strategy;

    public TemplateContext(TaxiTicket strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(TravelDetails travelDetail, int travelCost) {
         strategy.doPrintTicket(travelDetail, travelCost);
    }
}
