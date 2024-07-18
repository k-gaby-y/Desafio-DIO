package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	//implemetacao do metodo
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	//atributo
	private LocalDate data;
	
	//construtor
	public Mentoria() {
			
	}
		
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	


	
		
}
