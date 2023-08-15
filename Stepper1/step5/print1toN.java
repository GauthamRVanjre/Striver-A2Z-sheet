import java.util.Scanner;
class print1toN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }

    static void printNos(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        // System.out.print(n + " ");
        printNos(n-1);
    }
}