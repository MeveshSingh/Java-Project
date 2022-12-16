package Tutorial1;

public class LoopAssign {

	public static void main(String[] args) {
		// print 30 to 40 value and check it is 35 value present or not
		// if present then mark test case is pass.

		for (int i = 30; i <= 40; i++) {

			System.out.println(i);
			
			if(i==35) {
				
				System.out.println("Test case passed...");
			}
			

		}

	}

}
