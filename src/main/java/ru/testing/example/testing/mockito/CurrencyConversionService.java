package ru.testing.example.testing.mockito;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.testing.example.testing.commonService.ExternalCommunicationService;

@Component
@RequiredArgsConstructor
public class CurrencyConversionService {

    private final ExternalCommunicationService externalCommunicationService;


    public Double convertDollarIntoRoubles(Double amount, Integer samples){
        double accum = 0.0;
        for (int i = 0; i < samples ; i++) {
            accum += externalCommunicationService.getDollarCourse() * amount;
        }
        return accum / samples;
    }

}
