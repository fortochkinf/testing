package ru.testing.example.testing.jacoco;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComplexLogicService {

    public Integer process(Integer in){
        if(in / 5 == 4){
            log.info("case 1");
            return 2;
        }
        if (in % 3 == 1){
            log.info("case 2");
            return 4;
        }
        if (in + 5 == 11){
            log.info("case 3");
            return 11;
        }
        log.info("case 4");
        return in * 3;
    }

}
