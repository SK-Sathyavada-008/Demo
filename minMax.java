package Krishna_Package;
import java.util.Scanner;

// min max.java 
public class MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, min, max;
		System.out.print("Enter size of array : ");
		size = sc.nextInt();
		System.out.println(" ");
		
		int [] a = new int[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter element "+(i+1)+" : ");
			a[i] = sc.nextInt();
		}
		max = a[0];
		min = a[0];
		
		for(int i=1; i<size; i++) {
			if(a[i] < max) { //
				max = a[i];
			}
			if(a[i] > min) { //
				min = a[i];
			}
		}
		
		System.out.println(" ");
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
		
		sc.close();
	}

}
