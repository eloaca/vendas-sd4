package com.eloaca.vendas.controllers;

import com.eloaca.vendas.dto.SaleDTO;
import com.eloaca.vendas.dto.SaleSucessDTO;
import com.eloaca.vendas.dto.SaleSumDTO;
import com.eloaca.vendas.services.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@AllArgsConstructor
public class SaleController {

    private SaleService service;

    @GetMapping("/findAll")
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("/amountBySeller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        return ResponseEntity.ok(service.amountGroupedBySeller());
    }

    @GetMapping("/sucessBySeller")
    public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
        return ResponseEntity.ok(service.sucessGroupedBySeller());
    }
}
