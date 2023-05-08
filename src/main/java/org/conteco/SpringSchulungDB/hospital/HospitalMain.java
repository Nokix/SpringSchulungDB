package org.conteco.SpringSchulungDB.hospital;

public class HospitalMain {
    public static void main(String[] args) {
        String qualification = "Prof.";
        Doctor doctor = new Doctor(qualification);
        System.out.println(doctor.assist());
    }
}
