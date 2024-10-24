package examples_demo;

public class StringRev {
	
	public static void main(String[] args) {
		
		
		String name ="bhuvaneswar";
	
		String result ="";
		
		for(int i=name.length()-1;i>=0;i--) {
			result = result + name.charAt(i);
		}
		System.out.println(result);
		
		System.out.println();
		
		String welcome = " Good Ev  en  ing ";
		String str1 = welcome.replaceAll("\\s", "");
		System.out.println(str1);
		String str2 ="";
		
		System.out.println();
		System.out.println(welcome);
		
		for(int i=0;i<welcome.length();i++) {
			
			if(welcome.charAt(i)!=' ') {
				str2+=welcome.charAt(i);
				
				}
						
		}
		System.out.println(str2);
		
		
		
	}
	
	

}
