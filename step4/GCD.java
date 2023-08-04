import java.util.Scanner;
class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd);
    }

    static int findGCD(int num1, int num2){
        int gcd = 1;
        int smaller = num1 < num2 ? num1 : num2;
        for(int i = 1; i <= smaller; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}