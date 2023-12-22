package trabalho.poo.animal.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="especie")
	private String especie;
	@Column(name="nFilhote")
	private int nFilhote;
	@Column(name="qtdPata")
	private int qtdPata;
	@Column(name="reproducao")
	private String reproducao;
	@Column(name="alimentacao")
	private String alimentacao;
	
	public Animal() {

	}
	
	
	public Animal(Long id, String especie, int nFilhote, int qtdPata, String reproducao, String alimentacao) {
		super();
		this.id = id;
		this.especie = especie;
		this.nFilhote = nFilhote;
		this.qtdPata = qtdPata;
		this.reproducao = reproducao;
		this.alimentacao = alimentacao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getnFilhote() {
		return nFilhote;
	}
	public void setnFilhote(int nFilhote) {
		this.nFilhote = nFilhote;
	}
	public int getQtdPata() {
		return qtdPata;
	}
	public void setQtdPata(int qtdPata) {
		this.qtdPata = qtdPata;
	}
	public String getReproducao() {
		return reproducao;
	}
	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	
}
