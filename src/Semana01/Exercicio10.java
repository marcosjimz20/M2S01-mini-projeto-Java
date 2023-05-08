package Semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
//INICIO Exercicio 11
        ArrayList<String> listaAlunos = new ArrayList<>();
        ArrayList<double[]> listaNotas = new ArrayList<double[]>();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digitar o nome do Aluno ou Fim para finalizar");
        String nomeAluno = entrada.next();

        while (!nomeAluno.equalsIgnoreCase("fim")){
            listaAlunos.add(nomeAluno);

            System.out.println("Digitar as notas do Aluno " + nomeAluno);
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

        ArrayList<String> aprovados = new ArrayList<>();
        ArrayList<String> reprovados = new ArrayList<>();

        for ( int i = 0 ; i < listaAlunos.size() ; i++ ) {
            System.out.println("Aluno " + listaAlunos.get(i));
            System.out.println("Notas " + Arrays.toString(listaNotas.get(i)));

            double totalNotas = 0.0;
            for ( int n = 0 ; n < listaNotas.get(i).length ; n++ ) {
                totalNotas += listaNotas.get(i)[n];
            }
            double media = totalNotas / listaNotas.get(i).length;
            System.out.println("Média do Aluno " + listaAlunos.get(i) + " = " + media);
            if ( media >= 7.0) {
                aprovados.add(listaAlunos.get(i) + " com média " + media);
                } else {
                reprovados.add(listaAlunos.get(i) + " com média " + media);
            }

            System.out.println("Lista de aprovados e suas médias");
            //mostrar lista de aprovados
            aprovados.forEach(System.out::println);

            System.out.println("Lista de reprovados e suas médias");
            //mostrar lista de reprovados
            reprovados.forEach(System.out::println);
        }

        System.out.println("_______F_I_M_______");
//FIM do Exercicio 11
}
}
