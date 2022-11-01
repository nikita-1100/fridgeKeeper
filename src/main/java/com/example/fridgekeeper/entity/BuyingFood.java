package com.example.fridgekeeper.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BuyingFood extends BaseEntityWithUser{


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_barcode", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Food barcode;

    @Column(name="amount")
    private Float amount;

    @Column(name="date")
    private LocalDate date;

}
