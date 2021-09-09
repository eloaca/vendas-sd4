package com.eloaca.vendas.dto;

import com.eloaca.vendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleDTO implements Serializable {

    private static final long serialVersionUID = -5701274474495122198L;

    private Long id;
    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO (Sale s){
        id = s.getId();
        visited = s.getVisited();
        deals = s.getDeals();
        amount = s.getAmount();
        date = s.getDate();
        seller = new SellerDTO(s.getSeller());
    }
}
