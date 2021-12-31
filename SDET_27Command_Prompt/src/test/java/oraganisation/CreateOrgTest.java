package oraganisation;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups = {"smokeTest"})
	public void createOrg()
	{
		System.out.println("create org");
	}
	
	@Test(groups = {"regressionTest"})
	public void createOrg2()
	{
		System.out.println("create org2");
	}

}
