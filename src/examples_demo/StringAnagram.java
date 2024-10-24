package examples_demo;

import java.util.Arrays;

public class StringAnagram {
	
	public boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
			else {
				char[] c1 =s1.toLowerCase().toCharArray();
				char[] c2 =s2.toLowerCase().toCharArray();
				
				Arrays.sort(c1);
				Arrays.sort(c2);
				return Arrays.equals(c1, c2);
		}
	}
	public static void main(String[] args) {
		StringAnagram s = new StringAnagram();
		System.out.println(s.isAnagram("tenw", "net"));
	}
}
