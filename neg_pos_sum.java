package Krishna_Package;
import java.util.Scanner;

public class NegPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter size of array : ");
		size = sc.nextInt();
		
		int[] numbers = new int[size];
		int negsum = 0, possum = 0;
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter element "+(i+1)+" : ");
			numbers[i] = sc.nextInt();
			if(numbers[i] < 0) { 
				negsum = negsum + numbers[i];
			} else if(numbers[i] > 0) {
				possum = possum + numbers[i];
			}
		}
		
		System.out.println("Negative Sum = "+negsum);
		System.out.println("Positive Sum = "+possum);
		
		sc.close();
	}

}
