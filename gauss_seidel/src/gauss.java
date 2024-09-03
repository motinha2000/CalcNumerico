/* import java.util.Scanner;

public class gauss {

    // exibe a matriz
    public void ExibeMatriz(double[][] m, int n) {
        System.out.printf("%n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.printf("%.2f   ", m[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    //leitura da matriz
    public void LerMatriz(double[][] m, int n) {
        // leitura dos termos aij e bij
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.printf("Insira o termo a%d%d : %n", i + 1, j + 1);
                m[i][j] = ler.nextDouble();
            }
        }
        ler.close();

    }

    public static void main(String[] args) {
        double m[][], x[];

        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a ordem da matriz: ");
        n = ler.nextInt();
        ler.close();

        m = new double[n][n + 1];// matriz dos elementos
        x = new double[n];// matriz das raizes
        LerMatriz(m,n);
        ExibeMatriz(m,n);

    }

} */