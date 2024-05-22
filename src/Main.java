import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso go");
        curso3.setDescricao("descrição curso go");
        curso3.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("\n ===================================== PRIMEIRO ALUNO ===================================== \n");

        Dev devKlayvert = new Dev();
        devKlayvert.setNome("Klayvert");
        devKlayvert.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devKlayvert.getNome() + ": " + devKlayvert.getConteudosInscritos());
        devKlayvert.progredir();
        devKlayvert.progredir();
        devKlayvert.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos " + devKlayvert.getNome() + ": " + devKlayvert.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devKlayvert.getNome() + ": " + devKlayvert.getConteudosConcluidos());
        System.out.println("XP: " + devKlayvert.calcularTotalXp());


        System.out.println("\n ===================================== SEGUNDO ALUNO ===================================== \n");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJose.getNome() + ": " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos Inscritos " + devJose.getNome() + ": " + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devJose.getNome() + ": " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());

    }
}