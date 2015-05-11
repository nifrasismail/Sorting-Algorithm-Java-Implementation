
public class Insertion_Sorting {
	
	private int[] A;
	
	public void read(int[] A){
		this.A = A;
	}
	
	public int[] sort(){
		for (int i = 1; i <= A.length-1; i++) {
			int element = A[i];
			int j = i;
			while (j>0 && (A[j-1] > element)) {
				A[j] = A[j-1];
				j--;
			}
			A[j] = element;
		}
		return A;
	}
	
	public void print(){
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	
	public static void main(String[] args){
		int[] A = {23,42,4,16,8,15};
		Insertion_Sorting I = new Insertion_Sorting();
		
		I.read(A);
		I.sort();
		I.print();
	}
}
