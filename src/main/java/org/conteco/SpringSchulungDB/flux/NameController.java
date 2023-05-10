package org.conteco.SpringSchulungDB.flux;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    @Autowired
    Faker faker;

    // GET localhost:8080/names?n=100
    @GetMapping("/names")
    public List<String> getRandomNames(
            @RequestParam int n
    ) {
        return null;
    }
}
