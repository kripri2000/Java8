import java.util.Random;

public class ForEachRandomSort {
	public static void printFiveRandSort() {
		Random r = new Random();
		r.ints(5).sorted().forEachOrdered(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFiveRandSort();
	}

}
