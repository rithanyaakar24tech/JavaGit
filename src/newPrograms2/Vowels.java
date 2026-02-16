package newPrograms2;

public class Vowels {

	public static void main(String[] args) {
		
		String a = "Welcome to Java Class";
		
		int b=0;
		
		for (int i= 0; i<a.length(); i++) {
			
			char c = a.charAt(i);
			
			if(c=='a'  || c=='e' || c=='o' || c=='u') {
				
				b++;
				
			}
			else {
				
			}
		}
	System.out.println("Vowels count: "+b);

	}
}
