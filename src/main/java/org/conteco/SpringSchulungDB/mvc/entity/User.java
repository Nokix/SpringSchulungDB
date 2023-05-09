package org.conteco.SpringSchulungDB.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;

    public User(String name) {
        this.id = null;
        this.name = name;
    }
}
