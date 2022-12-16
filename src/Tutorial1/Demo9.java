package Tutorial1;

public class Demo9 {
	
	//print 80 to 90 value except 84 and 88 value
	
	public static void main(String[] args) {
		
		
		int i=80;
		
		while(i<=90) {
			
			if((i!=84)&&(i!=88)) 
				
				System.out.print(i+" ");
				i++;
			
		}
	}

}
