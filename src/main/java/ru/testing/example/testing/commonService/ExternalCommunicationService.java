package ru.testing.example.testing.commonService;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalCommunicationService {

    public Double getDollarCourse(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity("http://sitewhichnosaccesible", String.class);
        throw new IllegalStateException("This should not happens");
    }

}
