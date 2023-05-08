package org.conteco.SpringSchulungDB.hospital;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Doctor {
    @Value("Marcel")
    private String qualification;

    @Autowired
    private Nurse nurse;

    //    public Doctor(String qualification, Nurse nurse) {
//        this.qualification = qualification;
//        this.nurse = nurse;
//    }

    public String assist() {
        return "Dr. " + qualification + " is helping. "
                + nurse.assist();
    }
}
