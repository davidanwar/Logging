package com.falah.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidatorTest {


    @Test
    void testCreateValidator() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Assertions.assertNotNull(validator);
        validatorFactory.close();

    }
}
