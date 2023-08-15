import java.util.Scanner;
public class SumOfDigits {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findSumOfDigits(n);
	}

	/**
     * The function "findSumOfDigits" takes an integer as input and calculates the sum of the even and odd
     * digits separately, then prints the sums.
     * 
     * @param n The parameter "n" in the method "findSumOfDigits" represents an integer number for which
     * we want to find the sum of its even and odd digits.
     */
    static void findSumOfDigits(int n){
		int sumEven = 0;
		int sumOdd = 0;

		while(n>0){
			int remainder = n%10;
			if(remainder % 2 == 0){
				sumEven += remainder;
			}else{
				sumOdd += remainder;
			}

			n = n/10;
		}

		System.out.print(sumEven +" "+sumOdd);
	}
}
