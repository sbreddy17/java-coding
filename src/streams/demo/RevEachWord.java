package streams.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RevEachWord {
	
	public static void main(String[] args) {
		String input = "My name is bhuvaneswar";
		
		String collect = Arrays.stream(input.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(collect);
		System.out.println();
		String str = "abccddcceeffghi";
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					break;
				}
			}
		}
		
	}

}
