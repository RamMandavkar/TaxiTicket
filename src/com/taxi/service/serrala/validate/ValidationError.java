package com.taxi.service.serrala.validate;

public class ValidationError {

    String ValidationErrorMsg;

    String ValidationErrorCode;

    public ValidationError(String validationErrorMsg, String validationErrorCode) {
        ValidationErrorMsg = validationErrorMsg;
        ValidationErrorCode = validationErrorCode;
    }

    public String getValidationErrorMsg() {
        return ValidationErrorMsg;
    }

    public void setValidationErrorMsg(String validationErrorMsg) {
        ValidationErrorMsg = validationErrorMsg;
    }

    public String getValidationErrorCode() {
        return ValidationErrorCode;
    }

    public void setValidationErrorCode(String validationErrorCode) {
        ValidationErrorCode = validationErrorCode;
    }
}
