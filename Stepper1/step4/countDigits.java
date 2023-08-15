import java.util.Scanner;
public class countDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        count(num);
    }

    static void count(int num){
        int count = 0;
        while(num > 0){
            int lastDigit = num %10;
            count++;
            num = num/10;
        }

        System.out.println("The number of digits is: "+ count);
    }
}