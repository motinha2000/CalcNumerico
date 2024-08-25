import java.util.Scanner;

public class gauss {
    public static void main(String[] args) {
        
        
        float matriz[][];
        
        System.out.println("Insira a ordem da matriz: ");
        int n;n = 3;
        //n = Scanner.System.in(nextInt());
        
        n +=1;
        matriz = new float [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = i+j;
                System.out.printf("Insira o termo a%d%d : %n",i+1,j+1);
            }
        }

        System.out.printf("%n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%.2f - ",matriz[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

}