package org.example;
import java.util.Scanner;

public class AccessControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        int age = scanner.nextInt(); // Lê a idade como inteiro

        // Verificação das condições de acesso
        if (!hasPermission) {
            System.out.println("Acesso negado");
        } else if (age < 18) {
            System.out.println("Idade insuficiente");
        } else {
            System.out.println("Acesso permitido");
        }

        scanner.close();
    }
}
