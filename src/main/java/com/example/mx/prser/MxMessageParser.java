package com.example.mx.prser;

import com.example.mx.exception.MxMessageParsingException;

public interface MxMessageParser {

    String parse(String message) throws MxMessageParsingException;
}
