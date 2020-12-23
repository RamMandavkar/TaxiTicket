package com.taxi.service.serrala;


import com.taxi.service.serrala.model.Route;
import com.taxi.service.serrala.model.TravelDetails;
import com.taxi.service.serrala.services.ruleStrategy.Context;
import com.taxi.service.serrala.services.ruleStrategy.StrategyRuleOne;
import com.taxi.service.serrala.services.templateStrategy.TemplateContext;
import com.taxi.service.serrala.services.templateStrategy.TicketTemplateOne;
import com.taxi.service.serrala.validate.ValidateImpl;
import com.taxi.service.serrala.validate.ValidationError;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaxiServiceApplication {

    public static Map<String, Route> routes = new HashMap<String, Route>();

    static {
        Route r1 = new Route("PUNE", "MUMBAI", "120");
        routes.put(r1.getSource().concat("|").concat(r1.getDestination()), r1);

        Route r2 = new Route("PUNE", "NASIK", "200");
        routes.put(r2.getSource().concat("|").concat(r2.getDestination()), r2);

        Route r3 = new Route("MUMBAI", "GOA", "350");
        routes.put(r3.getSource().concat("|").concat(r3.getDestination()), r3);

        Route r4 = new Route("MUMBAI", "NASIK", "180");
        routes.put(r4.getSource().concat("|").concat(r4.getDestination()), r4);
    }

    ValidateImpl validateInputs = new ValidateImpl();

    public static void main(String[] args) {

        // System.out.println(routes.values().stream()
        //        .map(obj -> obj.toString()).collect(Collectors.joining("\n")));
        // System.out.println(args);
        TaxiServiceApplication app = new TaxiServiceApplication();
        app.process(Arrays.asList(args));
    }

    public int process(List<String> inputs) {
        List<ValidationError> errors = validateInputs.validate(inputs);
        if (errors.size() != 0) {
            System.out.println("Validation Error as Below : ");
            System.out.println(errors.stream()
                    .map(obj -> obj.getValidationErrorMsg()).collect(Collectors.joining("\n")));
            return 1;
        }
        TravelDetails travel = new TravelDetails(inputs.get(0), inputs.get(1), inputs.get(2));
        Context context = new Context(new StrategyRuleOne());
        int total = context.executeStrategy(travel);

        TemplateContext templateContext = new TemplateContext(new TicketTemplateOne());
        templateContext.executeStrategy(travel, total);

        return 0;
    }


}
