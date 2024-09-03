package gauss_seidel.principal;

public class teste {
    private double[][] A;
    private double[] b;

    public teste(double[][] A, double[] b){
        if(A == null || b == null)//checagem se a matriz é de ordem n
            throw new NullPointerException();
        if(A.length != b.length)
            throw new IllegalArgumentException();
        this.A = A;
        this.b = b;
    }

    public boolean converges(){//teste da conversão
        for(int i = 0; i< A.length;i++){
            double diagonal = Math.abs(A[i][i]);
            double tmpSum =0;
            for(int j=0;j<A.length;j++)
                if(i != j)
                    tmpSum += Math.abs(A[i][j]);//teste da diagonal principal
            if(tmpSum >= diagonal)
                return false;
        }
        return true;
    }

    public double[] solveSystem(int precision){
        if(!converges())
           System.err.println("A solução não converge");
        
        double[] x = initialize(new double[A.length]);
        for(int k=0;k<precision;k++)
            for(int i=0; i<A.length;i++){
                double x0 = 0;
                for(int j=0;j<A.length;j++)
                    if(i!=j)
                        x0+=A[i][j]*x[j];//raiz sendo atualizada
                x[i] = (b[i] - x0)/A[i][i];//raiz sendo atualizada
            }
        return x;
    }

    private double[] initialize(double[] ds){
        for(int i=0;i<ds.length;i++)
            ds[i] =0;
        return ds;
    }

}
