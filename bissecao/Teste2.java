package bissecao;

import java.util.Scanner;
import java.lang.Math;

public class Teste2 {
    public static double funcao(double r) {
        double q = 0.01;
        double q0 = 0.01;
        double t = 0.05;
        double l = 5;
        double c = 0.0001;
        return r = (-2 * l) / t * Math.log(q * t / q0 * Math.cos(Math.sqrt((1 / l * c) - Math.pow((r / 2 * l), 2))));
    }

    public static void bisseccao(double a, double b, double toler) {
        if (funcao(a) * funcao(b) >= 0) {
            System.out.println("Valores de intervalo invalidos.");
            return;
        }

        double c = a;
        int iter = 0;

        while ((b - a) >= toler) {
            // Encontra o ponto médio
            c = (a + b) / 2;
            iter++; // Incrementa o contador de iterações
            System.out.printf("Iteraçao %d: c = %.6f%n", iter, c);
            // Verifica se o ponto médio é a raiz
            if (funcao(c) == 0.0) {
                break;
            }
            // Decide o lado para continuar a busca
            else if (funcao(c) * funcao(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        System.out.printf("%nO valor da raiz é: " + c);
        System.out.printf("%nNúmero de iterações: " + iter);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("-- Metodo da Bisseccao --%n%nInsira os valores de: %nA: ");
        double a = ler.nextDouble();
        System.out.print("B: ");
        double b = ler.nextDouble();
        System.out.print("Digite o valor da tolerância: ");
        double toler = ler.nextDouble();
        System.out.printf("%n");

        bisseccao(a, b, toler);
        ler.close();
    }
}
