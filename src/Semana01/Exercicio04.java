package Semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
//INICIO Exercicio 4
        ArrayList<String> listaAlunos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
        String nomeAluno = entrada.next();

        while (!nomeAluno.equalsIgnoreCase("fim")) {

            System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
            nomeAluno = entrada.next();

        }

        System.out.println("_______F_I_M_______");
//FIM do Exercicio 4
    }
}
