public class SortingNumberPlayDemo {
	public static void main(String[] args) {
		System.out.println("First Array");
		SortingNumberPlay play1 = new SortingNumberPlay();
		play1.read();
		play1.Selection_Sort();
		play1.print();

		System.out.println("Second Array");
		SortingNumberPlay play2 = new SortingNumberPlay();
		play2.read();
		play2.Selection_Sort();
		play2.print();

		// SortingNumberPlay playFinal = new SortingNumberPlay();
		// playFinal.merge(play.A, play2.A);

		int newLen = play1.getLen() + play2.getLen();
		int m = play1.getLen() - 1;
		int n = play2.getLen() - 1;

		int[] newArray = new int[newLen];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i <= m && j <= n) {
			if (play1.get(i) < play2.get(j)) {
				newArray[k++] = play1.get(i);
				i++;
			} else {
				newArray[k++] = play2.get(i);
				j++;
			}
		}

		while (i <= m) {
			newArray[k++] = play1.get(i);
			i++;
		}

		while (j <= n) {
			newArray[k++] = play2.get(j);
			j++;
		}

		SortingNumberPlay playFinal = new SortingNumberPlay(newLen);
		playFinal.setA(newArray);
		System.out.print("Sorted Array : ");
		playFinal.print();
	}
}
