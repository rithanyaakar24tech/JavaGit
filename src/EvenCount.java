
public class EvenCount {

	
public static void main(String[] args) {
	
	
	int evenCount=0;
	int oddCount=0;
	
	
	for(int i=0; i<10; i++) {
		
		if(i%2==0) {
			
			evenCount = evenCount+1;
			
		}
		
		else {
			
			oddCount = oddCount+1;
			
		}
	}
	
	System.out.println("Event Count : " +evenCount);
	
	System.out.println("Odd Count: " +oddCount);
}
}

//even,odd
//i=0    0<10   0+1=1
//i=1    1<10   1+1=2
//i=2    2<10   2+1=3
//i=3    3<10   3+1=4
//i=4    4<10   4+1=5
//i=5    5<10   5+1=6
//i=6    6<10   6+1=7
//i=7    7<10   7+1=8
//i=8    8<10   8+1=9
//i=9    9<10   9+1=10---------loop stops






























