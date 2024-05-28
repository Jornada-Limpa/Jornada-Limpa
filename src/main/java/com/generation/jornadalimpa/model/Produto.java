package com.generation.jornadalimpa.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, max = 30, message = "O campo produto deve ter no minimo 1 e no maximo 30 caracteres")
	@NotBlank(message = "O campo produto nao pode estar vazio")
	private String produto;
	
	@Column(nullable = false, precision = 6, scale = 2) //Decimal(6,2) = 9999,99
	private BigDecimal preco;
	
	@Size(min = 1, max = 10, message = "O campo tamanho deve ter no minimo 1 e no maximo 10 caracteres")
	@NotBlank(message = "O campo tamanho nao pode estar vazio")
	private String tamanho;
	
	@Size(min = 1, max = 30, message = "O campo material deve ter no minimo 1 e no maximo 30 caracteres")
	@NotBlank(message = "O campo material nao pode estar vazio")
	private String material;
	
	@Size(min = 1, max = 30, message = "O campo cor deve ter no minimo 1 e no maximo 30 caracteres")
	@NotBlank(message = "O campo cor nao pode estar vazio")
	private String cor;
	
	@NotBlank(message = "O campo foto nao pode estar vazio")
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
