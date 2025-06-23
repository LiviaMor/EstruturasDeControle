package org.scarlet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (S/N) ");
        var isEmancipated = scanner.next().equalsIgnoreCase("S");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        if (canDrive) {
            System.out.printf("%s, você pode dirigir \n", name);
        } else {
            System.out.printf("%s, voce não pode dirigir \n", name);
        }
        System.out.println("Fim do programa.");

    }
}
