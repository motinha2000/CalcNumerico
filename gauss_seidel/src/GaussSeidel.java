import java.util.Scanner;

public class GaussSeidel {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a ordem da matriz: ");
        int n = ler.nextInt();

        double[][] m = new double[n][n + 1]; // matriz dos coeficientes e termos independentes
        double[] x = new double[n]; // vetor de incógnitas
        double[] xOld = new double[n]; // vetor para armazenar valores da iteração anterior

        // Inicializando o vetor de incógnitas com zeros
        for (int i = 0; i < n; i++) {
            x[i] = 0.0;
        }

        // Leitura dos termos aij e bij
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.printf("Insira o termo a%d%d: ", i + 1, j + 1);
                m[i][j] = ler.nextDouble();
            }
        }

        // Definindo tolerância e número máximo de iterações
        double tol = 1e-6;
        int maxIter = 100;

        // Método de Gauss-Seidel
        for (int iter = 0; iter < maxIter; iter++) {
            // Copia a última iteração para xOld
            System.arraycopy(x, 0, xOld, 0, n);

            // Atualização dos valores de x
            for (int i = 0; i < n; i++) {
                double sum = m[i][n]; // iniciar com o termo independente

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= m[i][j] * x[j]; // utiliza os valores mais recentes de x
                    }
                }

                x[i] = sum / m[i][i];
            }

            // Verificar critério de convergência
            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error += Math.abs(x[i] - xOld[i]);
            }

            if (error < tol) {
                System.out.println("Convergência alcançada em " + (iter + 1) + " iterações.");
                break;
            }
        }

        // Exibe os resultados
        System.out.println("\nSolução:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.6f\n", i + 1, x[i]);
        }

        ler.close();
    }
}
