import java.util.stream.*;

public class StreamIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream = Stream.of(1,3,4,6,7);
		stream.forEach(System.out::println);

	}

}
