package newPrograms;

public class fibonacci {

	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		
		for (int i=1; i<=10; i++) {
			
		int c=a+b;
		
		System.out.println(c);
		
		a=b;
		b=c;
	}
}
}

//0
//1
//i=1      1<=10t   c=0+1=1    a=1   b=1      i=1+1=2
//i=2      2<=10t   c=1+1=2    a=1   b=2      i=2+1=3
