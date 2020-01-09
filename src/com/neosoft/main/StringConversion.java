package com.neosoft.main;

import java.util.*;

public class StringConversion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String A = s.nextLine();
		String B = s.nextLine();
		s.close();
		
		int noOfTask = solution(A, B);
		
		if(noOfTask >= 0)
			System.out.println(noOfTask);
		else System.out.println("Not possible");

	}
	
	static int solution(String A, String B) {
		
		if(A.equals(B)) return 0;
		
		int totalNoOfTask = 0;
		int i = 0, j = 0;
				
		while(i < A.length() && j < B.length()) {
			
			if(A.charAt(i) != B.charAt(j)) return -1;
			
			int aNoOfTask = 1, bNoOfTask = 1;
			
			while(i < A.length()-1 && A.charAt(i) == A.charAt(i+1)) {
				aNoOfTask++; 
				i++;
			}
			
			while(j < B.length()-1 && B.charAt(j) == B.charAt(j+1)) {
				bNoOfTask++;
				j++;
			}
			
			totalNoOfTask += Math.abs(aNoOfTask - bNoOfTask);
			i++;
			j++;
		}
		
		if(i < A.length() || j < B.length()) return -1;
		
		return totalNoOfTask;
	}

}
