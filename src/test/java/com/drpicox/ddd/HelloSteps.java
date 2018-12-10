package com.drpicox.ddd;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static com.google.common.truth.Truth.assertThat;

public class HelloSteps {

    @Autowired NiceService niceService;

    @Given("say hello")
    public void say_hello() {
        System.out.println("Hello!");
        System.out.println(niceService);
        System.out.println("Hello!");
    }

}
