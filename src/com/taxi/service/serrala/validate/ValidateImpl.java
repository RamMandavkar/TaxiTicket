package com.taxi.service.serrala.validate;

import com.taxi.service.serrala.utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class ValidateImpl implements Validate {

    CommonMethods common = new CommonMethods();

    @Override
    public List<ValidationError> validate(List<String> input) {

        List<ValidationError> errors = new ArrayList<>();
        SizeValidator sizeV = new SizeValidator();

        if (sizeV.isValid(input, 3)) {
            errors.add(
                    new ValidationError("Please enter 3 arguments as 'source=PUNE, destination=NASIK, Travellers = 2'", "1"));
        }

        ValidationError source = validateSourcePlace(input.get(0));
        if (source != null) {
            errors.add(source);
        }

        ValidationError destinaion = validateDestinationPlace(input.get(1));
        if (destinaion != null) {
            errors.add(destinaion);
        }

        ValidationError travellers = validateTravellersNumber(input.get(2));
        if (travellers != null) {
            errors.add(travellers);
        }

        return errors;
    }

    public ValidationError validateSourcePlace(String input) {
        if (!input.isEmpty()) {
            if (common.isNumber(input)) {
                return new ValidationError("Please enter Source Place as String", "2");
            }
        } else {
            return new ValidationError("Please enter Source Place", "3");
        }
        return null;
    }

    public ValidationError validateDestinationPlace(String input) {

        if (!input.isEmpty()) {
            if (common.isNumber(input)) {
                return new ValidationError("Please enter Destination Place as String", "4");
            }
        } else {
            return new ValidationError("Please enter Destination Place", "5");
        }
        return null;
    }

    public ValidationError validateTravellersNumber(String input) {
        if (!input.isEmpty()) {
            if (!common.isNumber(input)) {
                return new ValidationError("Please enter number of Travellers as Number", "6");
            }
        } else {
            return new ValidationError("Please enter number of Travellers", "7");
        }
        return null;
    }
}

