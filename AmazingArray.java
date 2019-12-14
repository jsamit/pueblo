package com.interviewbit;

import java.util.Scanner;

public class AmazingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int count = 0;
		long len = str.length();
		
		char ch[] = {'a','e','i','o','u','A','E','I','O','U'};
		boolean yes = false;
		
		for(int i=0; i<len; i++) {
			
			for(int j=0; j<10; j++) {
				if(str.charAt(i) == ch[j]) {
					yes = true;
					break;
				}
				yes = false;
			}
			if(yes)
				count += (int)((len - i)%10003);
			
//			System.out.println(count);
		}
		System.out.println(count);
	}
}
