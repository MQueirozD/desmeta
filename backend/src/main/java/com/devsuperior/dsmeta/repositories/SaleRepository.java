package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	//modifica tudo q esta em sale
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	//seleciona todos objetos de sale onde a data (min) e a data(max) | em ordem decrescente
	//seleciona tods ente essas sales
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
