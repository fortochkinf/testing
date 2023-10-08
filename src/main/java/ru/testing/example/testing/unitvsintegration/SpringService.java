package ru.testing.example.testing.unitvsintegration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.testing.example.testing.commonService.VeryImportantService;

import java.util.Map;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class SpringService {
    private final VeryImportantService veryImportantService;
    private Map<String, Object> data;
}
