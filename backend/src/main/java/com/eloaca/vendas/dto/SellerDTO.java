package com.eloaca.vendas.dto;

import com.eloaca.vendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SellerDTO implements Serializable {

    private static final long serialVersionUID = -2457206736313593363L;

    private Long id;
    private String name;

    public SellerDTO(Seller s) {
        id = s.getId();
        name = s.getName();
    }
}
