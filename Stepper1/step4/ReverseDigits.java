import java.util.Scanner;
class ReverseDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
    }

    static void reverse(int num){
        int reverse = 0;
        int temp = num;
        while(temp > 0){
            int lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }
        System.out.println("The reverse of "+num+" is "+ reverse);
    }
}