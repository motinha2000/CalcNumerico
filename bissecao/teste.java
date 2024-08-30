package bissecao;

import java.util.Scanner;

public class Teste {

    float funcao(float r) {
        return (r * r) - 3;
    }

    void bissecao(float a, float b, float toler, int max_iter) {
        float c = 0;
        int iter = 0;

        if (funcao(a) * funcao(b) >= 0) {
            System.out.printf("Valores de intervalo invalidos.%n");
            return;
        }

        while ((b - a) >= toler && iter < max_iter) {
            c = (a + b) / 2;

            if (funcao(c) == 0.0) {
                break;
            } else if (funcao(c) * funcao(a) < 0) {
                b = c;
            } else {
                a = c;
            }

            iter++;
            System.out.printf("Iteração %d: c = %.6f%n", iter, c);

        }
        System.out.printf("A raiz aproximada é: %.6f%n", c);
    }

    public static void main(String[] args) {
        float a, b, toler;
        int max_iter;

        Scanner ler = new Scanner(System.in);

        System.out.printf("-- Metodo da Bisseccao --%n%nInsira os valores de: %nA: ");
        a = ler.nextFloat();
        System.out.printf("%nB: ");
        b = ler.nextFloat();
        System.out.printf("%nTolerancia de erro: ");
        toler = ler.nextFloat();
        System.out.printf("%nNúmero máximo de iterações: ");
        max_iter = ler.nextInt();

        Teste t = new Teste();
        t.bissecao(a, b, toler, max_iter);
        ler.close();
    }

}