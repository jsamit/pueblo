package com.interviewbit;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CountAndSay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		Vector<Integer> vec = new Vector<>();
		
		st.push(1);
		
		while(num != 1) {
			while(!st.isEmpty()) {
				int val = st.pop();
				int count = 1;
				
				while(!st.isEmpty() && val == st.peek()) {
					st.pop();
					count++;
				}
				
				vec.add(val);
				vec.add(count);
			}
			
			
			for(int i=vec.size(); i-- > 0;) {
				st.push(vec.get(i));
			}
			vec.removeAllElements();
			num--;
		}
		
		System.out.println(st.size());
		
	}
}
