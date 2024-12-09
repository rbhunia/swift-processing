package com.example.validator;

import com.prowidesoftware.swift.model.mt.AbstractMT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("MT103")
public class MT103Validator extends AbstractSwiftValidator {
    @Override
    public boolean validate() {
        // MT103-specific validation logic
        return true;
    }
}
