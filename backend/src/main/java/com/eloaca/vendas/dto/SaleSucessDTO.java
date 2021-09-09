package com.eloaca.vendas.dto;

import com.eloaca.vendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class SaleSucessDTO implements Serializable {

    private static final long serialVersionUID = 6842332663829414772L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSucessDTO(Seller seller, Long visited, Long deals){
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
