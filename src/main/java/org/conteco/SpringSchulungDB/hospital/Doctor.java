package org.conteco.SpringSchulungDB.hospital;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Doctor {
    @Value("${name:Hallo}")
    private String qualification;
    @Autowired
    private Nurse nurse;

//    public Doctor(
//            @Value("${name}") String qualification,
//            Nurse nurse
//    ) {
//        this.qualification = qualification;
//        this.nurse = nurse;
//    }

    public String assist() {
        return "Dr. " + qualification + " is helping. "
                + nurse.assist();
    }
}
