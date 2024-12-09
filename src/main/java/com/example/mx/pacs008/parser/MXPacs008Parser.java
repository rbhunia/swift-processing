package com.example.mx.pacs008.parser;

import com.example.mx.exception.MxMessageParsingException;
import com.example.mx.prser.AbstractMxParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MXPacs008Parser extends AbstractMxParser {

    @Override
    public String parse(String message) throws MxMessageParsingException {
        return null;
    }
}
