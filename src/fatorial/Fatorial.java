package fatorial;

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um n�mero inteiro n�o negativo:");

        if (input != null) {
            int n;

            try {
                n = Integer.parseInt(input);

                if (n < 0) {
                    JOptionPane.showMessageDialog(null, "Fatorial n�o � definido para n�meros negativos.");
                } else {
                    long resultado = fatorial(n);
                    JOptionPane.showMessageDialog(null, "Fatorial de " + n + " � " + resultado);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inv�lida! Digite um n�mero inteiro.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opera��o cancelada.");
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
