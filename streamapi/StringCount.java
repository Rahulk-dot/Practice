package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCount {
	
	//This code is taking an ArrayList of Strings as input
	//And we are supposed to give the output as number of strings with length greater than 3
	//So what we did is

	public static void main(String[] args) {
		
		//Input List
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		List<String> a= new ArrayList<>();
		for(int i = 0 ;i<m;i++) {
			a.add(sc.next());
		}
		
		//--- Using Stream API ---
		
		// 1. Here we initialized a stream of list a and filtered using lambda expressions.
		// 2. .filter(n -> n.length()>3) :  This line means that it will check for all elements in 
		       //List 'a' and will only let string whose length is greater than 3.
		// 3. Then we will collect the Strings and using '.collect' and we will count the number
		       //Of strings using 'Collectors.counting()'.
		// 4. We store the value in 'long value'.
		// 5. Then Display it.
	
		long value = a.stream().filter(n -> n.length()>3)
				.collect(Collectors.counting());
		System.out.println(value);
		
		sc.close();
	}

}
