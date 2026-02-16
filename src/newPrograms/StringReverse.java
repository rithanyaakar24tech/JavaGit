package newPrograms;

public class StringReverse {
public static void main(String[] args) {
	

	
String s = "Rithanyaa";
String res = "";


for(int i=s.length()-1; i>=0; i--) {
	
	char c = s.charAt(i);
	res=res+c;
	
}
System.out.println("String Reverse : "+res);
}
}