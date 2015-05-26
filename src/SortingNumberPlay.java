import java.util.Scanner;

public class SortingNumberPlay {
	private int[] A;
	private int len;
	private Scanner S;

	public SortingNumberPlay() {
		S = new Scanner(System.in);

		// Read the length from the user
		System.out
				.print("How many elements Do you need to add to the array : ");
		len = S.nextInt();

		// Create the array
		A = new int[len];
	}

	public SortingNumberPlay(int n) {
		len = n;
		A = new int[len];
	}

	public void read() {
		

		// Read the values from the User
		for (int i = 0; i < len; i++) {
			System.out.println("Enter Value : " + (i + 1));
			A[i] = S.nextInt();
		}
	}

	public void Selection_Sort() {
		for (int i = 0; i <= len - 2; i++) {
			int minIndex = i;
			for (int j = i + 1; j <= len - 1; j++) {
				if (A[minIndex] > A[j]) {
					minIndex = j;
				}
			}
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
		}
	}

	public void print() {
		for (int i = 0; i < len; i++) {
			System.out.print(A[i] + " ");
			if (i == A.length - 1) {
				System.out.println();
				System.out.println("*****************");
			}
		}
	}

	

	public int get(int i) {
		return A[i];
	}
	
	public int getLen() {
		return len;
	}
	
	public int[] getA() {
		return A;
	}
	
	public void setA(int[] a) {
		A = a;
	}
}
