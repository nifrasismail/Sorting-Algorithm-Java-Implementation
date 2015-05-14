
public class Selection_Sort {
	
	private int[] A;
	private int len;
	public void read(int[] A){
		this.A = A;
		len = A.length;
	}
	
	public void sort(){
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
