package com.example.fridgekeeper.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
public class Food extends BaseEntityWithBarcode{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Unit init;

    @Column(name = "food_name")
    private String foodName;

    @Column(name="calories")
    private Float calories;


}
