package com.example.fridgekeeper.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class UnitRecalculation extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_barcode", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Food barcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Unit init;

    @Column(name = "coef")
    private Float coef;
}
