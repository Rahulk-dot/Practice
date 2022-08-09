package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DuplicateElements {

	//This code uses stream to print the elements which has duplicates.
	//Here what we did is that we took a map with :
		//1. Key as the elements itself, and
		//2. Value as the number of times it is repeated.
	//Then we put that map through a stream with filter where we told it to filter the entry set with value greater than 1.
	//And same the Key in a list of integers.
	//Then we displayed that list.
	

	public static void main(String[] args) {
		
		//The input is given in a form of list of integers.
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		List<Integer> a= new ArrayList<>();
		for(int i = 0 ;i<m;i++) {
			a.add(sc.nextInt());
		}
		
		//Then we put that 'List<Integer>' in a stream.
		//We collected that list through '.collect' while the saving it in a 'Map<Integer,Integer>'.
		//'Function.identity' puts the elements in the Map -> f(x)=x.
		//'n -> 1' will increment each time the same value is added.
		//'Integer::sum' is the map.
		
		Map<Integer, Integer> hm = a.stream()
				.collect(Collectors.toMap(Function.identity(),n -> 1,Integer::sum));
		
		//Then we took that map and put it in a stream.
		//Then filtered that data with '.filter(n -> n.getValue()>1)' this will give us the 
		//		entry set where the Value is greater than 1 (i.e. value which has duplicates).
		//Then we took the Key of that entry set using '.map(e -> e.getKey())'.
		//Then we collected that using '.collect(Collectors.toList())'.
		
		List<Integer> hm2 = hm.entrySet().stream().filter(n -> n.getValue()>1)
				.map(e -> e.getKey())
				.collect(Collectors.toList());
		
		//We took the list and sorted it..
		
		Collections.sort(hm2);
		
		//Then we printed that.
		
		for(int i:hm2) 
			System.out.println(i);
		sc.close();
			
			
	}
}

