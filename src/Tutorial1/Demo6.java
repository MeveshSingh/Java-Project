package Tutorial1;

public class Demo6 {
	//print 50 to 60 value except 54 and 57 number
	
	public static void main(String[] args) {
		
		for(int i=50;i<=60;i++)
		{
			
			if(!(i==55)&&(!(i==57)))
			{
				
				System.out.print(i+" ");
			}
		}
	}

}
