/*
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

	Example:

	"A man, a plan, a canal: Panama" is a palindrome.

	"race a car" is not a palindrome.

	Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 * 
 * 
 */

package com.interviewbit;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		
		int last = str.length() - 1;
		boolean yes = true;

		
		for(int i=0; i<str.length()/2; i++) {
			
			// to check a character is alphanumeric
			while(true) {
				if(i > last )
					break;
				
				if((str.charAt(i) >= 97 && str.charAt(i) <= 122) 
						|| (str.charAt(i) >= 48 && str.charAt(i) <= 57))
					break;
				i++;
			}
			
			// to check a character is alphanumeric
			while(true) {
				
				if(last < i)
					break;
				
				if((str.charAt(last) >= 97 && str.charAt(last) <= 122) 
						|| (str.charAt(last) >= 48 && str.charAt(last) <= 57))
					break;
				last--;
			}
	
			if((i <= last) && str.charAt(last) != str.charAt(i)) {
				yes = false;
				break;
			}
			last--;
		}
		
		System.out.println(yes);
	}
}
