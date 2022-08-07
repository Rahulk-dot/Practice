package lambda;

import java.util.*;

public class GreaterThanTwo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//Normal Method
		
		System.out.println("---Using Normal Method---");
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>2) System.out.println(list.get(i));
		}
		
		System.out.println("");
		
		//Using Lambda functions
		
		System.out.println("---Using Lambda functions--");
		list.forEach(x -> {
			if(x>2) System.out.println(x);
		});

	}

}
