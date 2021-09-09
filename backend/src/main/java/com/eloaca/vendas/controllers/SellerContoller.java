package com.eloaca.vendas.controllers;

import com.eloaca.vendas.dto.SellerDTO;
import com.eloaca.vendas.services.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
@AllArgsConstructor
public class SellerContoller {

    private SellerService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<SellerDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
