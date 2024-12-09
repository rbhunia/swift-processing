package com.example.validator;

import org.springframework.stereotype.Service;

@Service
public class SwiftMessageProcessor {

    private final SwiftValidatorFactory validatorFactory;

    public SwiftMessageProcessor(SwiftValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
    }

    public void processMessage(String mtType) {
        SwiftValidator validator = validatorFactory.getValidator(mtType);
        if (validator.validate()) {
            System.out.println("Validation successful for MT type: " + mtType);
        } else {
            System.out.println("Validation failed for MT type: " + mtType);
        }
    }
}
