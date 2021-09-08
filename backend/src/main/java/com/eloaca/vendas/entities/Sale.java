package com.eloaca.vendas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "tb_sales")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sale implements Serializable {

    private static final long serialVersionUID = -3689002732097056443L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
}
