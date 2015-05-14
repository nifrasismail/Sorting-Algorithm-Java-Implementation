import java.util.Scanner;

import com.sun.scenario.effect.Merge;


public class SortingNumberPlay {
	public int[] A;
	public int len;
		
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
	
	public void Selection_Sort(){
		for (int i = 0; i <= len-2; i++) {
			int minIndex = i;
			for (int j = i+1; j <= len-1; j++) {
				if(A[minIndex] > A[j]){
					minIndex = j;
				}
			}
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
		}
	}
	
	public void print(){
		for (int i = 0; i < len; i++) {
			System.out.print(A[i] + " ");
			if(i == A.length-1){
				System.out.println();
				System.out.println("*****************");
			}
		}
	}
	
	public void print(int[] A){
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
			if(i == A.length-1){
				System.out.println();
				System.out.println("*****************");
			}
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
				newArray[k++] = A[i++];
				
			}
			else{
				newArray[k++] = B[j++];
			}
		}
		
		while(i<=m){
			newArray[k++] = A[i++];
		}
		
		while(j<=n){
			newArray[k++] = B[j++];
		}
		
		
		print(newArray);
	}
	
	public static void main(String[] args){
		System.out.println("First Array");
		SortingNumberPlay play = new SortingNumberPlay();
		play.read();
		play.Selection_Sort();
		play.print();
		
		System.out.println("Second Array");
		SortingNumberPlay play2 = new SortingNumberPlay();
		play2.read();
		play2.Selection_Sort();
		play2.print();
		
		SortingNumberPlay playFinal = new SortingNumberPlay();
		playFinal.merge(play.A, play2.A);
	}
}
