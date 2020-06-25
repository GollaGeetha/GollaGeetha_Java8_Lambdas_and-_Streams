package com.epam;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		 IntStream intstream = IntStream.of(2,7,8,9,5,4,6); 
		  
		OptionalDouble opt=intstream.average();
		
		if(opt.isPresent())
		{
			System.out.println(opt.getAsDouble());
		}
		else
		{
			  System.out.println("There are no values");
		}
	}
}
