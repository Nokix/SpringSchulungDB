package org.conteco.SpringSchulungDB.mvc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "Benutzer")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public User(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "user")
    private Address address;
}
