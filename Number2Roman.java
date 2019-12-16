package com.interviewbit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number2Roman {
	
	/**
	 * 
	 * @param Decimal Number
	 * @output Roman Number
	 * 
	 */

	public static void main(String[] args) {
		
		Map<Integer,String> mapping = new HashMap<>();
		
		mapping.put(1, "I");
		mapping.put(2, "II");
		mapping.put(3, "III");
		mapping.put(4, "IV");
		mapping.put(5, "V");
		mapping.put(6, "VI");
		mapping.put(7, "VII");
		mapping.put(8, "VIII");
		mapping.put(9, "IX");
		mapping.put(10, "X");
		mapping.put(40, "XL");
		mapping.put(50, "L");
		mapping.put(90, "XC");
		mapping.put(100, "C");
		mapping.put(400, "CD");
		mapping.put(500, "D");
		mapping.put(900, "CM");
		mapping.put(1000, "M");
		
		int[] keys = {1000,900,500,400,100,90,50,40,10,9,8,7,6,5,4,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder strb = new StringBuilder();
		
		for(int i=0; i<keys.length; i++) {
			if(num == 0) break;
			if(num%keys[i] != num) {
				int val = num/keys[i];
				while(val-- != 0)
					strb.append(mapping.get(keys[i]));
				num %= keys[i];
			}
		}
		
		System.out.println(strb);

	}

}
