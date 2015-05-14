import java.util.Scanner;


public class Merge_Sort {
	int[] A;
	int len;
	
	public void read(){
		Scanner S = new Scanner(System.in);
		
		//Read the length from the user
		System.out.print("How many elements Do you need to add to the array : ");
		len = S.nextInt();
		
		//Create the array
		A = new int[len];
		
		//Read the values from the User
		for (int i = 0; i < len; i++) {
			System.out.println("Enter Value : "+ (i+1));
			A[i] = S.nextInt();
		}
	}
	
	public void merge(int[] A, int[] B){
		int newLen = A.length + B.length;
		int m = A.length-1;
		int n = B.length-1;
		
		int[] newArray = new int[newLen];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<=m && j<=n){
			if(A[i] < B[j]){
				this.A[k++] = A[i++];
				
			}
			else{
				this.A[k++] = B[j++];
			}
		}
		
		while(i<=m){
			this.A[k++] = A[i++];
		}
		
		while(j<=n){
			this.A[k++] = B[j++];
		}
	}
	
	public void Merge_Sorter(int[] A){
		int n = A.length;
		
		if(n<2)
			return;
		
		int mid = n/2;
		
		int[] Left = new int[mid];
		int[] Right = new int[n-mid];
		
		for (int i = 0; i <= mid-1; i++) {
			Left[i] = A[i];
		}
		
		for (int i =mid ; i <= n-1; i++) {
			Right[i-mid] = A[i];
		}
		
		Merge_Sorter(Left);
		Merge_Sorter(Right);
		merge(Left, Right);
	}
	
	public void sort(){
		Merge_Sorter(A);
	}
	
	public void print(){
		System.out.println("Sortted Array \n **************************");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String[] args){
		Merge_Sort M = new Merge_Sort();
		M.read();
		M.sort();
		M.print();
	}
}
