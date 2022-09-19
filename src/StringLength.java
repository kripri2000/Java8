import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] string = {"hello","world","apples","welcome"};
		List<String> lst = new ArrayList<String>();
		lst.addAll(Arrays.asList(string));
		Long n = lst.stream().filter(str->(str.length()>5)).count();
		System.out.println(n);

	}

}
