package org.conteco.SpringSchulungDB.mvc.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private Long id;

    private String name;

    public User(String name) {
        this.id = null;
        this.name = name;
    }
}
