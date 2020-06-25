package com.epam;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Palin
{
	void palin_or_not();
	
}
public class Palindrome_Or_Not{  
    public static void palin_or_not1(){  
 
       	Stream<String> names = Stream.of("aBBa","CDFHD","cDg","ARA","AIRPLANE","sky","grapes","air");
		   names.
		         filter(s -> s.compareToIgnoreCase(new StringBuilder(s).reverse().toString()) == 0)
			      .collect(Collectors.toList()).forEach(System.out::println);
    } 


	public static void main(String[] args) {
	   
		Palin p=Palindrome_Or_Not::palin_or_not1;
		p.palin_or_not();
   
	}

}
