package com.taxi.service.serrala.services.ruleStrategy;

import com.taxi.service.serrala.TaxiServiceApplication;
import com.taxi.service.serrala.model.Route;
import com.taxi.service.serrala.model.TravelDetails;

public class StrategyRuleOne implements Strategy {

    @Override
    public int doOperation(TravelDetails travelDetail) {

        Route route = TaxiServiceApplication.routes.get(travelDetail.getSource().concat("|").concat(travelDetail.getDestination()));
        //System.out.println(" Distance :" + route.getDistance() + " Travellers : " + travelDetail.getTravellers());
        int remaining = Integer.parseInt(route.getDistance()) - 100;
        int remainingAmount = remaining * 5;

        int totalPerPerson = remainingAmount + 750;

        int total = totalPerPerson * Integer.parseInt(travelDetail.getTravellers());
        //System.out.println(" Total : " + total);
        return total;
    }


}
