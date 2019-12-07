package com.anahita.demo.dal.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode
public class Demo {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String test;

}
