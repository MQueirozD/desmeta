package com.devsuperior.dsmeta.services;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate,Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());//cria uma data com o dia do que esta no sistema
		
		
		
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("")? today : LocalDate.parse(maxDate);
		//maxDate.equals("")? today - se a gente não colocar nada vai ser o dia de hj
		//LocalDate.parse(maxDate);
		//pega a data max (data de hj) e data min (data de 1ano atras)
		return repository.findSales(min, max, pageable) ;//busca todas as 
	}

}
