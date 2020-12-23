package com.taxi.service.serrala.validate;

import java.util.List;

public class SizeValidator implements IValidator<List<String>, Integer> {

    @Override
    public boolean isValid(List<String> inputs, Integer limit) {
        if (inputs.size() != limit) {
            return true;
        }
        return false;
    }
}
