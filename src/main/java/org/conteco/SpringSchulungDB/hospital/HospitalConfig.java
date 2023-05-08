package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HospitalConfig {
    @Bean
    @Profile("dev")
    public String getQ() {
        return "Joachim";
    }

    @Bean
    @Profile("!dev")
    public String getQ2() {
        return "Robin";
    }
}
