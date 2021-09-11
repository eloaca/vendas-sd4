package com.eloaca.vendas.repositories;

import com.eloaca.vendas.dto.SaleSucessDTO;
import com.eloaca.vendas.dto.SaleSumDTO;
import com.eloaca.vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.eloaca.vendas.dto.SaleSumDTO(s.seller, SUM(s.amount)) " +
            "FROM Sale AS s GROUP BY s.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.eloaca.vendas.dto.SaleSucessDTO(s.seller, SUM(s.visited), SUM(s.deals)) " +
            "FROM Sale AS s GROUP BY s.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}
