package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.annotation.*;

@ComponentScan
@PropertySource("classpath:application.properties")
public class HospitalMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HospitalMain.class);

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.assist());
    }
}
