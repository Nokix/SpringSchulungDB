package org.conteco.SpringSchulungDB.kafka;

import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("kafka")
public class KafkaController {



    @KafkaListener(id = "ViktorListener", topics = "topic1")
    public void listen(String value) {
        System.out.println(value);
    }
}
