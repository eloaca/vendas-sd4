package com.eloaca.vendas.services;

import com.eloaca.vendas.dto.SaleDTO;
import com.eloaca.vendas.dto.SaleSucessDTO;
import com.eloaca.vendas.dto.SaleSumDTO;
import com.eloaca.vendas.entities.Sale;
import com.eloaca.vendas.repositories.SaleRepository;
import com.eloaca.vendas.repositories.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class SaleService {

    private SaleRepository repository;

    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller(){
        return repository.sucessGroupedBySeller();
    }
}
