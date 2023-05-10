package org.conteco.SpringSchulungDB.mvc.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String name;

    public User(String name) {
        this.id = null;
        this.name = name;
    }
}
