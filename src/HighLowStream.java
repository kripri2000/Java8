import java.util.Comparator;
import java.util.stream.*;

public class HighLowStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer max = Stream.of(1,2,3,6,8).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max element : "+max);
		Integer min = Stream.of(1,2,3,6,8).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum element : "+min);

	}

}
