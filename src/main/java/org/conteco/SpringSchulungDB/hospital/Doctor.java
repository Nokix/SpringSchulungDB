package org.conteco.SpringSchulungDB.hospital;

public class Doctor {
    public String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String assist() {
        return "Dr. " + qualification + " is helping";
    }
}
