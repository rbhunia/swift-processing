package com.example.validator;

import org.springframework.stereotype.Component;

@Component("MT910")
public class MT910Validator extends AbstractSwiftValidator {
    @Override
    public boolean validate() {
        // MT910-specific validation logic
        return true;
    }
}