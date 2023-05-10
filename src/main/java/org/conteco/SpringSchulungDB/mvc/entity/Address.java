package org.conteco.SpringSchulungDB.mvc.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String street;

    @OneToOne
    private User user;
}
