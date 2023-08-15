import java.util.Scanner;
class printNtimes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter=0;
        printNos(counter,n);
    }

    static void printNos(int counter,int n){
        if(counter == n){
            return;
        }
        System.out.println("print "+n);
        counter++;
        printNos(counter,n);
    }

}