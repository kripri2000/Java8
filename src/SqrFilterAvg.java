//uses map,filter and average functions --> returns a number of type OptionalDouble if not empty

import java.util.*;

public class SqrFilterAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<Integer>();
		Integer arr[] = {2,10,11,34};
		lst.addAll(Arrays.asList(arr));
		OptionalDouble avg = lst.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println(avg);

	}

}
