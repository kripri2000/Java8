//uses stream and map functions

import java.util.*;

public class ListSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5};
		List<Integer> lst = new ArrayList<Integer>();
		lst.addAll(Arrays.asList(arr));
		int sum = lst.stream().mapToInt(i->i).sum();
		System.out.println(sum);
	}

}
