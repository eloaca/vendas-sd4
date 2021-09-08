package com.eloaca.vendas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity(name = "tb_sellers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seller implements Serializable {

    private static final long serialVersionUID = 8617564992414945221L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "seller")
    private List<Sale> sales;
}
