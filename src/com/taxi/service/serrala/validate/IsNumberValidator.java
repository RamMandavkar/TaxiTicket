package com.taxi.service.serrala.validate;

import com.taxi.service.serrala.utils.CommonMethods;

public class IsNumberValidator implements IValidator<String, String> {

    CommonMethods common = new CommonMethods();
    @Override
    public boolean isValid(String input, String limit) {

        if (common.isNumber(input)) {
            return true;
        }
        return false;
    }
}
