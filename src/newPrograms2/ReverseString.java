package newPrograms2;

public class ReverseString {
public static void main(String[] args) {
	
String s ="Good Morning";
String res="";

String[] a = s.split(" ");

for(String x : a) {        
    String rev = "";

    for(int i = x.length() - 1; i >= 0; i--) {
        char b = x.charAt(i);
        rev = rev + b;
    }

    res = res + rev + " ";
}
System.out.println(res);
}}