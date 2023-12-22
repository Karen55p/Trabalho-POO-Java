package trabalho.poo.animal.model.dto;

import trabalho.poo.animal.model.entity.Animal;

public class AnimalDto {

	private Long id;
	private String especie;
	private int nFilhote;
	private int qtdPata;
	private String reproducao;
	private String alimentacao;
	
	public AnimalDto() {
		
	}
	
	public AnimalDto(Animal animal) {
		super();
		this.id = animal.getId();
		this.especie = animal.getEspecie();
		this.nFilhote = animal.getnFilhote();
		this.qtdPata = animal.getQtdPata();
		this.reproducao = animal.getReproducao();
		this.alimentacao = animal.getAlimentacao();
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
