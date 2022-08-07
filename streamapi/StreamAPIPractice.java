package streamapi;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPIPractice {

	public static void main(String[] args) {
		
		//Simple Stream function it took value from 'list' and gave the square of each element.
		
		System.out.println("---NORMAL FUNCTION---");
		List<Integer> list = Arrays.asList(2,3,4,5);
		List<Integer> result = list.stream().map(i -> i*i).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		//Calling the filter function
		usingfilter(list);
		
		//Calling the sorted function
		usingSorted();
		
		//Calling the reduce function
		usingReduce(list);
	}
	
	//Method for Using the 'filter' function.
	//This function mainly filters and gives us the desired data.

	public static void usingfilter(List<Integer> list) {
		
		//Here filter is giving us a filtered data that is greater than 2.
		
		System.out.println("---FILTER FUNCTION---");
		List<Integer> result1 = list.stream().filter(x -> x>2).collect(Collectors.toList());
		result1.forEach(System.out::println);
	}
	
	//Method for Using the 'sorted' function
	//This function sorted the data given to it.
	
	public static void usingSorted() {
		
		//Here we just took the 'list' and sorted it using 'sorted()' and saved it in 'sortedResult'.
		
		System.out.println("---SORTED FUNCTION---");
		List<String> list = Arrays.asList("test","java","welcome","blue");
		List<String> sortedResult = list.stream().sorted().collect(Collectors.toList());
		sortedResult.forEach(System.out::println);
 	}
	
	//Method for Using 'reduce' function.
	//This function reduce and gives a single output.
	
	public static void usingReduce(List<Integer> list) {
		
		//Here it is just the taking the even value elements from the list and returning their sum.
		
		System.out.println("---REDUCE FUNCTION---");
		int finalResult = list.stream().filter(x -> x%2==0).reduce(0,(val,i) -> val+i);
		System.out.println(finalResult);
	}

}
