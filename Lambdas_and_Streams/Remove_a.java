package com.epam;

import java.util.stream.Stream;

public class Remove_a {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("aBc","CDFHD","cDg","AER","AIRPLANE","sky","grapes","air");
	
		names.map(String::toLowerCase).filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(System.out::println);
	}

}
