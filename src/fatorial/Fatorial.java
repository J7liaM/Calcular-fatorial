/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro n�o negativo: ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Fatorial n�o � definido para n�meros negativos.");
        } else {
            long resultado = fatorial(n);
            System.out.println("Fatorial de " + n + " � " + resultado);
        }

        teclado.close();
    }

    public static long fatorial(int n) {
        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
    
