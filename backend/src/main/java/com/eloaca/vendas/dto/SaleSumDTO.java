package com.eloaca.vendas.dto;

import com.eloaca.vendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class SaleSumDTO implements Serializable {

    private static final long serialVersionUID = -7666110735484064850L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum){
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}
