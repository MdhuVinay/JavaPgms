package practiceSDET48;

import org.testng.annotations.Test;

public class Practice_TestNg_Test
{
	@Test(enabled = true, priority = -2, dependsOnMethods = "delete")
	public void update()
	{
		System.out.println("update");
	}
	
	
	
	@Test(enabled = true, priority = -1, groups = "smoke")
	public void create()
	{
		System.out.println("create");
	}
	
	
	
	@Test(enabled = true, priority = 0)
	public void delete() 
	{
		System.out.println("delete");
	}
}
