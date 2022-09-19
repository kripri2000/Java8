import java.util.Arrays;
import java.util.stream.*;
public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,8,1,2,3,9};
		Arrays.sort(arr);
		IntStream s = Arrays.stream(arr);
		s.forEach(System.out::println);
		
	
	}

}
