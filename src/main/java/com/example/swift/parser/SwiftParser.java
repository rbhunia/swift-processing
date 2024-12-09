package com.example.swift.parser;

import com.example.swift.model.SwiftMessage;

public interface SwiftParser {

    SwiftMessage parse(String swiftMessage);
}
