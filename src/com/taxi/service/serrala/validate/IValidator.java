package com.taxi.service.serrala.validate;

public interface  IValidator<T,U> {

    boolean isValid(T t, U u);
}
