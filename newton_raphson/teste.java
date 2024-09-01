package newton_raphson;

import java.util.Scanner;
import java.lang.Math;

public class teste {
    public static double funcao(double x) {
        return x * x - 4;
    }

    public static double derivadaFuncao(double x) {
        return 2 * x;
    }

    public static double newtonRaphson(double chuteInicial, double toler) {
        double x = chuteInicial;
        int iter = 0;

        while (true) {
            double fx = funcao(x);
            double dfx = derivadaFuncao(x);

            if (dfx == 0) {
                throw new ArithmeticException("Derivada zero. O método de Newton-Raphson pode falhar.");
            }

            double xNovo = x - fx / dfx;

            if (Math.abs(xNovo - x) < toler) {
                System.out.printf("Número de iterações: %d%n", iter + 1);
                return xNovo;
            }

            x = xNovo;
            iter++;
            System.out.printf("Iteraçao %d: x = %.6f%n", iter, x);
        }
    }

    public static void main(String[] args) {
        double chuteInicial = 1.0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Tolerancia: ");
        double toler = ler.nextDouble();

        try {
            double raiz = newtonRaphson(chuteInicial, toler);
            System.out.printf("Raiz encontrada: %.6f%n", raiz);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        ler.close();
    }
}
