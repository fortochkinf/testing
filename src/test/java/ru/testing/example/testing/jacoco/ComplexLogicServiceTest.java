package ru.testing.example.testing.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexLogicServiceTest {

    @Test
    void process() {
        ComplexLogicService complexLogicService = new ComplexLogicService();
        int result = complexLogicService.process(5);
        result = complexLogicService.process(20);
        result = complexLogicService.process(16);

    }
}