package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
    	
    	if(s1.length() == s2.length()) {
    		for(int i = 0; i < s1.length(); i++) {
    			if(s1.charAt(i) != s2.charAt(i)) {
    				return false;
    			}
    		}
    		return true;
    	}
        return false;
    }
}