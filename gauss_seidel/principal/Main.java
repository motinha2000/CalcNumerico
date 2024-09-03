package gauss_seidel.principal;

public class Main {
    public static void main(String[] args) {
        double[][] A = {{3,-0.1,-0.2},
                        {0.1,7,-0.3},
                        {0.3,-0.2,10}};
        double[] b = {7.85,-19.3,71.4};

        teste solver = new teste(A,b);
        double[] x = solver.solveSystem(8);

        for(int i =0;i<x.length;i++)
            System.out.println(x[i]);

    }
}
