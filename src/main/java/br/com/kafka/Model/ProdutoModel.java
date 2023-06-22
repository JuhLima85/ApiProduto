package br.com.kafka.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class ProdutoModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private Double quantidade;
	private Double valor;
	
	public ProdutoModel() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoModel(Long id, String nome, Double quantidade, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double d) {
		this.quantidade = d;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(double d) {
		this.valor = d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoModel other = (ProdutoModel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ProdutoModel [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}

	
}
