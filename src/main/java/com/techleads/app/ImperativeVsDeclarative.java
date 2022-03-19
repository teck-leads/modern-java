package com.techleads.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		
		
		
		//imperative how style of programming
		int sum=0;
		for(int i=1; i <= 100;i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		//Declarative type, what style of programming
		
		int mySum = IntStream
//		.range(0, 100) //4950
		.rangeClosed(0, 100)
		.parallel()
		.sum();
		System.out.println(mySum);
		
		System.exit(0);
		List<Integer> nums = Arrays.asList(1, 45, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
		
		//imperative
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer n: nums) {
			if(!uniqueList.contains(n)) {
				uniqueList.add(n);
			}
		}
		System.out.println(uniqueList);
		
		System.out.println();
		//Declarative
		List<Integer> uniq = nums.stream()
		.distinct()
		.collect(Collectors.toList());
		uniq.forEach(System.out::println);
	}

}
