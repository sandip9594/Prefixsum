//given an array we need to find sum  range between two value

public class SumOfgivenRange {
    public static void main(String [] args){
        int A[] = {1,5,6,-3,4,6};
        int B[][] = {{1,4},{0,4},{3,5},{4,5}};
        int ans [] = sum(A,B);

        for(int i=0;i<B.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static int [] sum(int A[],int B[][]){
        int N=B.length;
        int K []= new int[N];

        for(int i=0;i<N;i++){
            int L=B[i][0];
            int R=B[i][1];
            int Add=0;
            for(int j=L;j<=R;j++){
                Add=Add+A[j];
            }

            K[i]=Add;
        }

        return K;
    }
}
