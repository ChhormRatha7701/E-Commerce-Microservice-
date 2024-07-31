package com.quicksoft.customer.cofig;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Event Master API",
        version = "v1",
        description = "Watch as your vision comes to life flawlessly. \n" +
                "EventMaster handles all the logistics, coordinating \n" +
                "vendors, managing registrations,  and providing \n" +
                "real-time updates, so you can focus on making \n" +
                "memories."))
@SpringBootApplication
public class OpenAPIConfig {
}
