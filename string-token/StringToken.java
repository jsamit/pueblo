package com.hackerrank;

import java.util.Scanner;

public class StringToken {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine().trim();
	        String tokens[] = s.split("[\\s!,?._'@]+");
	        
	        if(s.isEmpty())
	        	System.out.println(0);
	        else {
	        	System.out.println(tokens.length);
	        	for(String str : tokens)
	        		System.out.println(str);
	        }
	        scan.close();
	    }
}
