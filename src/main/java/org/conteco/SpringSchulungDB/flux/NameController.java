package org.conteco.SpringSchulungDB.flux;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class NameController {

    @Autowired
    Faker faker;

    @GetMapping("/names")
    public Flux<String> getRandomNames(
            @RequestParam int n
    ) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(faker.funnyName().name());
        }
        return Flux.fromIterable(names).delayElements(Duration.ofSeconds(1));
    }
}
