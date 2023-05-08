package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
//INICIO Exercicio 5
        ArrayList<String> listaAlunos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
        String nomeAluno = entrada.next();

        while (!nomeAluno.equalsIgnoreCase("fim")){
            listaAlunos.add(nomeAluno);

            System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
            nomeAluno = entrada.next();

        }

        listaAlunos.forEach(System.out::println);
        System.out.println("_______F_I_M_______");
//FIM do Exercicio 5
    }
}
