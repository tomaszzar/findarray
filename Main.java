package findarray;

public class Main {

	public static void main(String[] args) {
		int[] a = {7, 8, 9};
		int[] b = {8, 9};
		MyFindArray my = new MyFindArray();
		System.out.println("Numeric match found at " + my.findArray(a, b));

	}

}
