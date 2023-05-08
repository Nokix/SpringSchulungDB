package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Nurse {
    public String assist() {
        return "Nurse is assisting.";
    }
}
