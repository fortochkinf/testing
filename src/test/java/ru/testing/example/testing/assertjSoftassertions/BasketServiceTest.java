package ru.testing.example.testing.assertjSoftassertions;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasketServiceTest {

    /*
    Добавить несколько элементов, убедится что повторящиеся элементы не добавляются
    Убедится что все (несколько) элементов добавляется
    Использовать assertj и его softAssertions
    Самостоятельно посмотреть список методов https://www.javadoc.io/doc/org.assertj/assertj-core/latest/org/assertj/core/api/AbstractIterableAssert.html


        SoftAssertions.assertSoftly(x -> {
            assertThat(basket.showBasket()).contains("a");
        });

     */

    @Test
    void put() {


    }
}