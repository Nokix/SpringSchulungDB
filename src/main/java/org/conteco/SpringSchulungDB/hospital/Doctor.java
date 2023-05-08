package org.conteco.SpringSchulungDB.hospital;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Component
public class Doctor {
    private String qualification;
    private Nurse nurse;

    public Doctor(
            String qualification,
            Nurse nurse
    ) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public String assist() {
        return "Dr. " + qualification + " is helping. "
                + nurse.assist();
    }
}
