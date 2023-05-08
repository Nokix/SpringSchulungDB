package org.conteco.SpringSchulungDB.hospital;

public class Doctor {
    private String qualification;
    private Nurse nurse;

    public Doctor(String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public String assist() {
        return "Dr. " + qualification + " is helping. "
                + nurse.assist();
    }
}
