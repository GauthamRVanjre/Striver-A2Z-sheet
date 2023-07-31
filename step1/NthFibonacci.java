import java.util.Scanner;
public class NthFibonacci {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = findFib(n);
		System.out.print(ans);
	}

	/**
     * The function findFib calculates the nth Fibonacci number using an iterative approach.
     * 
     * @param n The parameter `n` represents the position of the Fibonacci number to be found.
     * @return the nth Fibonacci number.
     */
    static int findFib(int n){
		if(n < 1){
			return 0;
		}
		if(n ==1 || n== 2){
			return 1;
		}
		int prev = 1;
		int curr = 1;
		int sum =1;
		for(int i=3;i<=n;i++){
			sum = prev + curr;
			prev = curr;
			curr = sum;
		}
		return sum;
	}

}