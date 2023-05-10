package org.conteco.SpringSchulungDB.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("kafka")
public class KafkaController {
    @Autowired
    KafkaTemplate<String, String> template;

    @GetMapping("/kafka/{message}")
    public void postToKafka(@PathVariable String message) {
        template.send("topic1", message);
    }

    @KafkaListener(id = "ViktorListener", topics = "topic1")
    public void listen(String value) {
        System.out.println(value);
    }
}
