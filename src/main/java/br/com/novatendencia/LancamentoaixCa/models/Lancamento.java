package br.com.novatendencia.LancamentoaixCa.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "Lancamentos")
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(nullable = false, unique = false)
	private Referencia referencia;
	
	@Column(name = "tipo", length = 100, nullable = false)
	private String tipo;
	
	@Column(name = "valor", nullable = false)
	private BigDecimal valor;
	
	@Column(name = "data", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Referencia getReferencia() {
		return referencia;
	}

	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}
}