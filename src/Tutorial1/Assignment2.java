package Tutorial1;

public class Assignment2 {
	/*1) if a number is between 1 to 100 then display number is small
	2)if a number is between 101 to 1000 then display number is medium
	3) if a number is between 1001 to 10000 then display number is large
	4) if a number is above 10001 then display number is biggest
	5) if a number is not matche above condition then display number is zero or negative   */
	
	public static void main(String[] args) {
		int a=-1;
		
		if((a>0)&&(a<=100))
		{
			
			System.out.println("Number is small");
		}
		else if(a>=1000) {
			System.out.println("Number is medium");
			
		}
		else if(a>10000) {
			
			System.out.println("Number is large");
		}
		else if(a>10001) {
			System.out.println("Biggest number");
		}
		
		else {
			
			System.out.println("Number is zero or negative");
		}
	}

}
