package com.in28minutes.spring.basics.n28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class N28minutesApplication {

	public static void main(String[] args) {
		//BinarySearchImp binarySearch = new BinarySearchImp(new QuickSortAlgorithm()); 
		ApplicationContext applicationContext = 
				SpringApplication.run(N28minutesApplication.class, args);
		BinarySearchImp binarySearch= applicationContext.getBean(BinarySearchImp.class);
		int result = 
				binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println(result);
		//SpringApplication.run(N28minutesApplication.class, args);
	}

}
