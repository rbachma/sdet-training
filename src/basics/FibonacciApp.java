package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
		System.out.println(fact(5));
		int[] numbers = {1,2,3,45,52,4,545,23,4,2};
		System.out.println(findMin(numbers));
	}
	
	public static int fib(int n){
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		
		return (fib(n - 1) + fib(n - 2));
		
		
	}
	public static int fact(int n){
		if (n == 0){
			return 1;
		}
		return (fact(n -1) * n);
	}
	
	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

}
