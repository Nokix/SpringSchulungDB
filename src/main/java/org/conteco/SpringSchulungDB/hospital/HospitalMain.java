package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class HospitalMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HospitalMain.class);

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.assist());

    }
}
