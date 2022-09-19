//uses Random class ints() method in java8


import java.util.Random;
public class ForEachRandom {
	
	public static void printFiveRand()
	{
		Random random = new Random();
		random.ints(5).forEach(System.out::println);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFiveRand();

	}

}
