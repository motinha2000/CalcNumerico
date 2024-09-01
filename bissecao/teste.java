package bissecao;

import java.util.Scanner;
import java.lang.Math;

public class Teste {

    double funcao(double r) {
        double q = 0.01;
        double q0 = 0.01;
        double t = 0.05;
        double l = 5;
        double c = 0.0001;
        //System.out.printf("FUNÇÃO: %.6f%n",r);
        return r = (-2*l/t) * Math.log(q*t/q0*Math.cos(Math.sqrt((1/l*c)-Math.pow((r/2*l),2))));
        //return -((2*5)/0.05)*2.718281*(q(t)/(q0*cos(sqrt((1/(L*C)-(R/2*L)^2)*t))));
        //return (r * r) - 3;
    }

    void bissecao(double a, double b, double toler, int max_iter) {
        double c = 0;
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
        double a, b, toler;
        int max_iter;

        Scanner ler = new Scanner(System.in);

        System.out.printf("-- Metodo da Bisseccao --%n%nInsira os valores de: %nA: ");
        a = ler.nextDouble();
        System.out.printf("%nB: ");
        b = ler.nextDouble();
        System.out.printf("%nTolerancia de erro: ");
        toler = ler.nextDouble();
        System.out.printf("%nNúmero máximo de iterações: ");
        max_iter = ler.nextInt();

        Teste t = new Teste();
        t.bissecao(a, b, toler, max_iter);
        ler.close();
    }

}