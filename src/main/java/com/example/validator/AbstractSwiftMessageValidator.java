package com.example.validator;

import com.prowidesoftware.swift.model.mt.AbstractMT;

import java.util.Objects;

public abstract class AbstractSwiftMessageValidator implements SwiftMessageValidator{

    protected boolean isIncomingMessage(AbstractMT swiftMessage) {
        return swiftMessage.isIncoming();
    }

    protected boolean isValidReceiverBic(AbstractMT swiftMessage) {
        return Objects.equals(swiftMessage.getReceiver(), "SWIFT");
    }
}
