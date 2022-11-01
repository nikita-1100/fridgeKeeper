package com.example.fridgekeeper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Unit extends BaseEntity{
    @Column(name="unit_name")
    private String unitName;
}
