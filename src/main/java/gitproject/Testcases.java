package gitproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
	@Test
	public void positiveData() {
		int arr[]= {2,4,5,6};
		NaturalNumbers nn=new NaturalNumbers();
		boolean naturalNumberOrNot = nn.naturalNumberOrNot(arr);
		Assert.assertEquals(naturalNumberOrNot, true);
		}
	@Test
	public void negativeData() {
		int arr[]= {2,4,5,6,-1,-3,-8};
		NaturalNumbers nn=new NaturalNumbers();
		boolean naturalNumberOrNot = nn.naturalNumberOrNot(arr);
		Assert.assertEquals(naturalNumberOrNot, false);
		
	}
	
	

}
