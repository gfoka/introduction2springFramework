package com.in28minutes.spring.basics.n28minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	/*
	public BinarySearchImp(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
	
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);
		return 3;
	}





}
 