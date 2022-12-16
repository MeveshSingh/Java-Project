package Tutorial1;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		/*find  big number  of 5 numbers
		int a=100;
		int b=120;
		int c=23;
		int d=455;
		int e=355;
		 		*/
		
		int a =100,b=200,c=1510,d=80,e=122;
		
		if((a>b)&&(a>c)&&(a>d)&&(a>e)) {
			
			System.out.println("A is large");
		}
		else if((b>c)&&(b>d)&&(b>e)) {
			
			System.out.println("B is large");
		}
		else if((c>d)&&(c>e)) {
			System.out.println("C is large");
		}
		else if((d>e)) {
			System.out.println("D is large");
		}
		else {
			System.out.println("E is large");
		}

	}

}
