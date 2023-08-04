import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPalindrome = checkPalindrome(num);
        if(isPalindrome){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not a palindrome");
        }
    }

    static boolean checkPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while(temp > 0){
            int lastDigit = temp%10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }
        if(reverse == num){
            return true;
        }else{
            return false;
        }
    }
}