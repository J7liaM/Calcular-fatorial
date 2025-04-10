package fatorial;

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro não negativo:");

        if (input != null) {
            int n;

            try {
                n = Integer.parseInt(input);

                if (n < 0) {
                    JOptionPane.showMessageDialog(null, "Fatorial não é definido para números negativos.");
                } else {
                    long resultado = fatorial(n);
                    JOptionPane.showMessageDialog(null, "Fatorial de " + n + " é " + resultado);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número inteiro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
    }

    public static long fatorial(int n) {
        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
