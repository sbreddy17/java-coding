package demo_project;

import java.util.stream.Collectors;

public class RemoveDupString {
	
	public static void main(String[] args) {
		String Sentence="bbhhuuvvaanneesswwaarr";
		
		StringBuilder sb1= new StringBuilder();
		Sentence.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
	
	}

}
