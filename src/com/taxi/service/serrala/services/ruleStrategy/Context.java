package com.taxi.service.serrala.services.ruleStrategy;

import com.taxi.service.serrala.model.TravelDetails;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(TravelDetails travelDetail) {
        return strategy.doOperation(travelDetail);
    }
}
