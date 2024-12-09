package com.example;

import com.example.validator.SwiftMessageProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ApplicationRunner implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }

    private final SwiftMessageProcessor processor;

    public ApplicationRunner(SwiftMessageProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run(String... args) {
        processor.processMessage("MT103");
        processor.processMessage("MT910");
    }
}
