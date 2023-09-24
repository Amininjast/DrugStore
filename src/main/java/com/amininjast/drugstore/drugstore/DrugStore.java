package com.amininjast.drugstore.drugstore;

import jakarta.persistence.*;

@Entity
public class DrugStore {
    @Id
    @SequenceGenerator(name = "id", sequenceName = "id")
    @GeneratedValue(generator = "id", strategy = GenerationType.SEQUENCE)
    private Integer drugId;
    @Column
    private String drugName;
}
