
public class Bubble_Sort {
	int[] A;
	int length;
	
	public void read(){
		int[] B = {48,25,36,95,96,32,31,32};
		A = B;
		length = A.length;
	}
	
	public void sort(){
		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < A.length-1-i; j++) {
				if(A[j] > A[j+1]){
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;			
				}
			}
		}	
	}
	
	public void print(){
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String[] args){
		Bubble_Sort B = new Bubble_Sort();
		B.read();
		B.sort();
		B.print();
	}
	
}
