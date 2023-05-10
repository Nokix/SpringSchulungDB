package org.conteco.SpringSchulungDB.flux;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class NameController {

    @Autowired
    Faker faker;

    // GET localhost:8080/names?n=100
    @GetMapping("/names")
    public Flux<String> getRandomNames(
            @RequestParam int n
    ) {
        Stream<String> nameStream = Stream.generate(faker.funnyName()::name).limit(n);
        return Flux.fromStream(nameStream).delayElements(Duration.ofSeconds(1));
    }
}
