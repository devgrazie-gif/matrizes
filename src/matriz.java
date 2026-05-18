import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz -> 3 x 3:");

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "], da matriz: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }

            System.out.println();
        }
        scanner.close();
    }
}

