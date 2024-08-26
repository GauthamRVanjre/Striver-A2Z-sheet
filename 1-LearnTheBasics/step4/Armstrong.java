import java.util.Scanner;
public class Armstrong {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean res = isPalindrome(num);
		System.out.print(res);
	}

	static boolean isPalindrome(int num){
		int count = 0;
		int temp = num;
		
		while(temp != 0){
			count++;
			temp = temp/10;
		}

		temp = num;
		double sum=0;
		while(temp != 0){
			int lastDigit = temp %10;
			sum = sum + Math.pow(lastDigit, count);
			temp = temp/10;
		}

		if(sum == num){
			return true;
		}
		return false;
	}
}
