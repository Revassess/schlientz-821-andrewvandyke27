package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
		String n = Long.toString(num);
		int length = n.length();
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			String s = n.charAt(i) + "";
			sum += Math.pow(Integer.parseInt(s), length);
		}
		
		if(sum == num)
			return true;
		
		return false;
	}
}
