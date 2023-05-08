package org.conteco.SpringSchulungDB.hospital;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HospitalConfig {
    @Bean("abc")
    public String getQ() {
        return "Joachim";
    }

    @Bean
    public String qualification() {
        return "Robin";
    }
}
