package com.eloaca.vendas.services;

import com.eloaca.vendas.dto.SellerDTO;
import com.eloaca.vendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        return repository.findAll().stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
