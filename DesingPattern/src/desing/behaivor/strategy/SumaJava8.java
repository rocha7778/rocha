package desing.behaivor.strategy;

import java.util.function.BiFunction;

public class SumaJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 Integer result = SumaJava8.operatation((a,b)-> a+b, 3,3);
		 System.out.println("Result: "+result);
		 
		 
		 result = SumaJava8.operatation((a,b)-> a-b, 3,3);
		 System.out.println("Result: "+result);
		
		

	}
	
	
	public static Integer operatation(BiFunction<Integer, Integer, Integer> f, Integer a, Integer b) {
		
		return f.apply(a, b);
	}

}
