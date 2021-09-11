package com.eloaca.vendas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "tb_sales")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sale {

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
