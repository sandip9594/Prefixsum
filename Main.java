
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int A[] = {1,5,6,-3,4,6};
            int B[][] = {{1,4},{0,4},{3,5},{4,6}};
            int PF[] = Prefixsum(A);

            for(int i=0;i<A.length;i++){
                System.out.print(PF[i]+" ");
            }

        }
        public static int [] Prefixsum(int A[]){
            int N=A.length;
            int PF[]= new int[N];
            PF[0]=A[0];

            for(int i=1;i<N;i++){
                PF[i]=PF[i-1]+A[i];
            }
            return PF;
        }
    }
