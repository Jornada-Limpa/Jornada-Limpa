package com.generation.jornadalimpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.jornadalimpa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
//	public List<Produto> findAllByProdutoContainingIgnoreCase(@Param("produto") String produto);
//	public List<Produto> findAllByTamanhoContainingIgnoreCase(@Param("tamanho") String tamanho);
//	List<Produto> findAllByOrderByPrecoAsc();
//	List<Produto> findAllByOrderByPrecoDesc();
}

