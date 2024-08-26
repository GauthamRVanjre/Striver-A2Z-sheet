import java.util.Scanner;
class print1toN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        printNos(i,n);
    }

    static void printNos(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNos(i+1,n);
    }
}