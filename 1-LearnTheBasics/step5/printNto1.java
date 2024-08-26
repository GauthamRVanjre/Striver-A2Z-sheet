import java.util.Scanner;
class printNto1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=n;
        printNos(i,n);
    }

    static void printNos(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        printNos(i-1,n);
    }
}