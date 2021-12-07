package com.sunje.test.sample;

import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("person")
public class Person {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    // constructors, getters, setters
}