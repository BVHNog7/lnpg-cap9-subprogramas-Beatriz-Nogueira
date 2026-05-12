import java.util.Scanner;

public class Modularizado {

    public static String lerAluno(Scanner sc, int numeroAluno) {
        System.out.print("Digite o nome do aluno " + numeroAluno + ": ");
        return sc.nextLine();
    }

    public static double[] lerNotas(Scanner sc, String nomeAluno) {
        double[] notas = new double[3];

        System.out.println("Digite as 3 notas de " + nomeAluno + ":");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        sc.nextLine(); // limpar buffer do ENTER

        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7) {
            return "ALUNO APROVADO";
        } else if (media >= 5) {
            return "ALUNO EM RECUPERACAO";
        } else {
            return "ALUNO REPROVADO";
        }
    }

    public static void imprimirRelatorio(String[] nomes, double[][] notas, double[] medias, String[] situacoes) {
        System.out.println("\n\n RELATORIO FINAL ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            System.out.println("Notas: " + notas[i][0] + ", " + notas[i][1] + ", " + notas[i][2]);
            System.out.printf("Media: %.2f\n", medias[i]);
            System.out.println("Situacao: " + situacoes[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];
        String[] situacoes = new String[5];

        System.out.println(" SISTEMA DE CONTROLE ACADEMICO \n");

        for (int i = 0; i < 5; i++) {
            nomes[i] = lerAluno(sc, i + 1);
            double[] notasAluno = lerNotas(sc, nomes[i]);

            notas[i] = notasAluno;
            medias[i] = calcularMedia(notasAluno);
            situacoes[i] = determinarSituacao(medias[i]);

            System.out.println();
        }

        imprimirRelatorio(nomes, notas, medias, situacoes);

        sc.close();
    }
}
