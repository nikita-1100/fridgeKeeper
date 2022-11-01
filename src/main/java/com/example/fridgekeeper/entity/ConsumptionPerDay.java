package com.example.fridgekeeper.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class ConsumptionPerDay extends BaseEntityWithUser{
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_barcode", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Food barcode;

    @Column(name="average_consumption")
    private Float averageConsumption;
}
