package bissecao;

import java.util.Scanner;
import java.lang.Math;

public class Teste {

    double funcao(double r) {
        //declaração das constantes
        double q = 0.01;
        double t = 0.05;
        double l = 5;
        double c = 0.0001;
        // return (r * r) - 3;
        // return (r*r*r)-r-1;
       
            double alpha = r / (2 * l);//isolando constantes
            double omega = Math.sqrt((1 / (l * c)) - (alpha * alpha));//isolando constantes
            return ((((Math.exp(-alpha * t)) * (Math.cos((omega * t)))) - q));//retorno dos valores
        }

    void bissecao(double a, double b, double toler, int max_iter) {
        double c = 0;
        int iter = 0;

         if (funcao(a) * funcao(b) >= 0) {//teste
            System.out.printf("Valores de intervalo invalidos.%n");
            return;
         }

        while ((b - a) >= toler && iter < max_iter) {
            c = (a + b) / 2;//raiz

            if (funcao(c) == 0.0) {
                break;
            } else if (funcao(a) * funcao(b) >= 0) {//teste do sinal
                a = c;
            } else {
                b = c;
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

        //leitura das variáveis
        System.out.printf("-- Metodo da Bisseccao --%n%nInsira os valores de: %nA: ");
        a = ler.nextDouble();
        System.out.printf("%nB: ");
        b = ler.nextDouble();
        System.out.printf("%nTolerancia de erro: ");
        toler = ler.nextDouble();
        System.out.printf("%nNúmero máximo de iterações: ");
        max_iter = ler.nextInt();

        Teste t = new Teste();//instancia do metodo
        t.bissecao(a, b, toler, max_iter);
        ler.close();
    }

}