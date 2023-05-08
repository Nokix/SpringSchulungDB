package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Nurse nurse = context.getBean(Nurse.class);
        System.out.println(nurse.assist());
//        System.out.println(doctor.assist());
//        String qualification = "Prof.";
//        Doctor doctor = new Doctor(qualification);
    }
}
