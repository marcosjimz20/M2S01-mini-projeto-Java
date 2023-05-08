package Semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<>();
        ArrayList<double[]> listaNotas = new ArrayList<double[]>();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
        String nomeAluno = entrada.next();

        while (!nomeAluno.equalsIgnoreCase("fim")){
            listaAlunos.add(nomeAluno);

            System.out.println("Digitar as notas do Aluno  " + nomeAluno);
            System.out.println("Digite a nota #1 = ");
            double n1 = entrada.nextDouble();
            System.out.println("Digite a nota #2 = ");
            double n2 = entrada.nextDouble();
            System.out.println("Digite a nota #3 = ");
            double n3 = entrada.nextDouble();
            double[] notas = new double[3];
            notas[0] = n1;
            notas[1] = n2;
            notas[2] = n3;
            listaNotas.add(notas);

            System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
            nomeAluno = entrada.next();

        }

        for ( int i = 0 ; i < listaAlunos.size() ; i++ ) {
            System.out.println("Aluno " + listaAlunos.get(i));
            System.out.println("Notas " + Arrays.toString(listaNotas.get(i)));

        }

        System.out.println("_______F_I_M_______");
//FIM do Exercicio 8
    }
}
