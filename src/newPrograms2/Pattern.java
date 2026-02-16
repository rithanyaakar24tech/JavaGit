package newPrograms2;

public class Pattern {
 
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			
			for (int j=0; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
//i=1      1<=3t       j=0   0<1      *        j=0+1=1
//                     j=1   1<1f--nextline-------------i=1+1=2
//i=2      2<=3t       j=0   0<2    *         j=0+1=1
