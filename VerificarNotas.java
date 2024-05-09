import java.util.Scanner;

public class VerificarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Notas de Michele
        int[] portugues = {9, 8, 8};
        int[] matematica = {8, 3, 6};
        int[] ciencias = {8, 9, 9};
        int[] humanidades = {4, 3, 3};

        // Verificar se precisa de recuperação em cada matéria
        verificarRecuperacao("Portugues", portugues);
        verificarRecuperacao("Matematica", matematica);
        verificarRecuperacao("Ciencias", ciencias);
        verificarRecuperacao("Humanas", humanidades);

        scanner.close();
    }

    // Função para verificar se precisa de recuperação em uma matéria
    private static void verificarRecuperacao(String materia, int[] notas) {
        double media = calcularMedia(notas);
        System.out.println("Média em " + materia + ": " + media);

        if (media >= 7) {
            System.out.println("Michele não precisa de recuperação em " + materia);
        } else if (media >= 5)  {
            System.out.println("Michele precisa de recuperação em " + materia);
        } else {
            System.out.println("Michele está reprovada em " + materia);
        }
    }

    // Função para calcular a média das notas
    private static double calcularMedia(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / (double) notas.length;
    }
}
