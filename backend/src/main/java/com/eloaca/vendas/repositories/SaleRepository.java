package com.eloaca.vendas.repositories;

import com.eloaca.vendas.dto.SaleSucessDTO;
import com.eloaca.vendas.dto.SaleSumDTO;
import com.eloaca.vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.eloaca.vendas.dto.SaleSumDTO(s.seller, SUM(s.amount)) " +
            "FROM tb_sales AS s GROUP BY s.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.eloaca.vendas.dto.SaleSucessDTO(s.seller, SUM(s.visited), SUM(s.deals)) " +
            "FROM tb_sales AS s GROUP BY s.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}
