public class gauss {
    public static void main(String[] args) {
        
        int n;
        n = Teclado.lerInteiro("Informe a ordem da matriz: ");
        System.out.println(n);
        int matriz[][];
        matriz = new int [n][n];
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                matriz[i][j] = Teclado.lerInteiro("Informe o elemento da posição");
            }
        }

    }

}