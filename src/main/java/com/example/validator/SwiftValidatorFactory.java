package com.example.validator;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SwiftValidatorFactory {

    private final Map<String, SwiftValidator> validatorMap;

    public SwiftValidatorFactory(Map<String, SwiftValidator> validatorMap) {
        this.validatorMap = validatorMap;
    }

    public SwiftValidator getValidator(String mtType) {
        SwiftValidator validator = validatorMap.get(mtType);
        if (validator == null) {
            throw new IllegalArgumentException("No validator found for message type: " + mtType);
        }
        return validator;
    }
}