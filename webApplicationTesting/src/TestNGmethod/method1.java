package TestNGmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class method1 {
	
	
		    @Test
		    public void testAddition() {
		        int a = 5;
		        int b = 10;
		        int sum = a + b;
		        Assert.assertEquals(sum, 15, "The sum should be 15.");
		        
		       
		    }
		
	
	
	

}
