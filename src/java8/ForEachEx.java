package java8;
import java.util.ArrayList;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> gamesList = new ArrayList<String>();  
         gamesList.add("Football");  
         gamesList.add("Cricket");  
         gamesList.add("Chess");  
         gamesList.add("Hocky");  
         gamesList.forEach(games->System.out.println(games));
	}

}
