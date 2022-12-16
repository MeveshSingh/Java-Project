package Tutorial1;

public class Demo10 {
	
	//print 80 to 90 value except 84 and 88 value using do while loop
	// in real time we never use do-while loop
	
public static void main(String[] args) {
	
	int i=80;
	
	do {
		
		if((i!=84)&&(i!=88))
		
		System.out.print(i+" ");
		i++;
	}
	while(i<=90);
	
}
}
