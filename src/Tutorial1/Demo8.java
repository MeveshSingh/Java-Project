package Tutorial1;

public class Demo8 {
	
	//print 30 to 40 value except 35 No
	
	public static void main(String[] args) {
		
		int i=30;
		
		while(i<=40) {
			
			if(!(i==35)) {
				System.out.print(i+",");
				i++;
			}
		}
	}

}
