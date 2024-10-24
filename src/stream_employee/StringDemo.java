package stream_employee;

public class StringDemo {
	
	public static void main(String[] args) {
		String input = "Welcome to java Tutorials";
		String[] words =input.split(" ");
		String output= "";
		for(String word : words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord = revWord + word.charAt(i);
			}
			output = output+revWord+" ";
		}
		System.out.println(output);
		
		String name = "  dggd wehd  wehb  wehwuidj  wdjwdj";
//		System.out.println(name.replaceAll("\\s", ""));
		String noSpace="";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				noSpace=noSpace+name.charAt(i);
			}
		}
		System.out.println(noSpace);
	}

}
