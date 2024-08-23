

public class gauss {
    public static void main(String[] args) {
        
        int n;
        n = 3;
        System.out.println(n);
        int matriz[][];
        matriz = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = i+j;
            }
        }

        System.out.printf("%n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d - ",matriz[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

}