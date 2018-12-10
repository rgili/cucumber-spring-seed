package com.drpicox.ddd;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static com.google.common.truth.Truth.assertThat;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
public class NiceSteps {

    @Autowired NiceService niceService;

    @Given("the nice service is nice")
    public void the_nice_service_is_nice() {
        assertThat(niceService.isNice()).isTrue();
    }

}
