package com.example.swift.model;

import java.time.LocalDateTime;

public record SwiftMessage(String payload,
                           MessageType messageType,
                           LocalDateTime messageReceivedTime) {

    public enum MessageType {
        MT103,
        MT910,
        MT101,
        MT900,
        MT940,
        MT950
    }
}