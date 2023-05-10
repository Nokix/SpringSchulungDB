package org.conteco.SpringSchulungDB.hospital;

import org.springframework.context.annotation.*;

@ComponentScan
@PropertySource("classpath:application-kafka.properties")
public class HospitalMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HospitalMain.class);

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.assist());
    }
}
