package com.example.validator;

import com.prowidesoftware.swift.model.mt.AbstractMT;

public interface SwiftMessageValidator {

    boolean validate(AbstractMT swiftMessage);
}
