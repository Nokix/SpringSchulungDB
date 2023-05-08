package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.assist());
    }
}
