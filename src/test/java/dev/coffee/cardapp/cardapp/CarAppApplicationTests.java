package dev.coffee.cardapp.cardapp;

import dev.coffee.cardapp.cardapp.controller.RanchControllerTests;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarAppApplicationTests {

    @Autowired
    private RanchControllerTests ranchController;

    @Test
    @DisplayName("Load RanchController")
    void contextLoads() {
        Assertions.assertThat(ranchController).isNotNull();
    }
}
