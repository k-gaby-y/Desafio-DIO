import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Git e Github");
		curso2.setDescricao("Descrição curso Git e GitHub");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria orientação a objetos");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Desenvolvendo com Java");
		bootcamp.setDescricao("Descrição bootcamp desenvolvendo com Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGabriely = new Dev();
		devGabriely.setNome("Gabriely");
		devGabriely.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Gabriely" + devGabriely.getConteudosInscritos());
		System.out.println("-");
		
		devGabriely.progredir();
		devGabriely.progredir();
		devGabriely.progredir();
		System.out.println("Conteúdos inscritos Gabriely" + devGabriely.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Gabriely" + devGabriely.getConteudosConcluidos());
		System.out.println("XP: " + devGabriely.calcularTotalXp());
		System.out.println("************");
		
		Dev devTeste = new Dev();
		devTeste.setNome("Teste");
		devTeste.increverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Teste" + devTeste.getConteudosInscritos());
		System.out.println("-");
		
		devTeste.progredir();
		System.out.println("Conteúdos inscritos Teste" + devTeste.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Teste" + devTeste.getConteudosConcluidos());
		System.out.println("XP: " + devTeste.calcularTotalXp());
		
		
	}
}
