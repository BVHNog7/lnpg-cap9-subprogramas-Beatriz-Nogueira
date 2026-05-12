import java.util.Scanner;

public class Monolitico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];
        String[] situacoes = new String[5];

        System.out.println("SISTEMA DE CONTROLE ACADEMICO");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();

            double soma = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }

            sc.nextLine(); // limpar buffer do ENTER

            medias[i] = soma / 3;

            if (medias[i] >= 7) {
                situacoes[i] = "ALUNO APROVADO";
            } else if (medias[i] >= 5) {
                situacoes[i] = "ALUNO EM RECUPERACAO";
            } else {
                situacoes[i] = "ALUNO REPROVADO";
            }
        }

        System.out.println("\n\nRELATORIO FINAL");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            System.out.println("Notas: " + notas[i][0] + ", " + notas[i][1] + ", " + notas[i][2]);
            System.out.printf("Media: %.2f\n", medias[i]);
            System.out.println("Situacao: " + situacoes[i]);
        }

        sc.close();
    }
}
