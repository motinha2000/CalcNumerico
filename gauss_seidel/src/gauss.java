import java.util.Scanner;

public class gauss {
    public static void main(String[] args) {
        
        
        float matriz[][];
        Scanner ler = new Scanner(System.in);
        int n;
        float x[];
        
        float r1,r2,r3;
        r1=3; r2=(-25/10); r3=7;
        
        System.out.println("Insira a ordem da matriz: ");
        n = ler.nextInt();
        
        matriz = new float [n][n+1];
        x = new float [n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                System.out.printf("Insira o termo a%d%d : %n",i+1,j+1);
                matriz[i][j] = ler.nextFloat();
            }
        }

        System.out.printf("%n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                System.out.printf("%.2f   ",matriz[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");


        /* x1 = ((matriz[0][3]-(matriz[0][1]*x2)-(matriz[0][2]*x3))/matriz[0][0]);
        x2 = ((matriz[1][3]-(matriz[1][0]*x1)-(matriz[1][2]*x3))/matriz[1][1]);
        x3 = ((matriz[2][3]-(matriz[2][0]*x1)-(matriz[2][1]*x2))/matriz[2][2]);
    
        System.out.printf("Resultado x1 = %.4f %n", x1);
        System.out.printf("Resultado x2 = %.4f %n", x2);
        System.out.printf("Resultado x3 = %.4f %n", x3);

        x1 = ((matriz[0][3]-(matriz[0][1]*x2)-(matriz[0][2]*x3))/matriz[0][0]);
        x2 = ((matriz[1][3]-(matriz[1][0]*x1)-(matriz[1][2]*x3))/matriz[1][1]);
        x3 = ((matriz[2][3]-(matriz[2][0]*x1)-(matriz[2][1]*x2))/matriz[2][2]);
    
        System.out.printf("Resultado x1 = %.4f %n", x1);
        System.out.printf("Resultado x2 = %.4f %n", x2);
        System.out.printf("Resultado x3 = %.4f %n", x3); */
    
    }

}