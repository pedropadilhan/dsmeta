package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

/*Componente do sistema responsavel por acessar o banco de dados*/
public interface SaleRepository extends JpaRepository<Sale, Long>{

	
}
