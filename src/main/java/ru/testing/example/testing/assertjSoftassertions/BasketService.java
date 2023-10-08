package ru.testing.example.testing.assertjSoftassertions;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class BasketService {

    private final List<String> content = new ArrayList<>(List.of(
            "Moon",
            "Soon",
            "Pool",
            "Cool"
    ));

    public void put(String item){
        for (var elem : content){
            if (elem.equals(item)){
                return;
            }
        }
        content.add(item);
    }

    public List<String> showBasket(){
        Collections.shuffle(content);
        return content;
    }
}
