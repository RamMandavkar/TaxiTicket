package com.taxi.service.serrala.services.templateStrategy;

import com.taxi.service.serrala.model.TravelDetails;

public interface TaxiTicket {

    void doPrintTicket(TravelDetails travelDetail, int travelCost);

}
