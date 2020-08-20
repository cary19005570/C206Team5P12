import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ParentTest {
	
	private Parent par1;
	private Parent par2;
	private Parent par3;
	@Before
	public void setUp() throws Exception {
		par1 = new Parent("Mr Lim","coolcool@lame.com","11000","Sam","Pri 1","1A","Ms Sor");
		par2 = new Parent("Mr Loo","coolcool11@lame.com","12000","Samy","Pri 2","1A","Ms Sor");
	}
	@After
	public void tearDown() throws Exception {
		par1 = null;
		par2 = null;
		ParentDB.parentlist.clear();
	}
	@Test
	public void addParentTest() {
		 
		//Test that parent list is NOT null
		assertNotNull("Test that parent list is NOT null",ParentDB.parentlist);
		//Test that the parent list size is 0 before adding any parent
		assertEquals("Test that the parent list size is 0 before adding any parents", 0,ParentDB.parentlist.size());
		//Test that the size of parent list is 1 after adding a parent
		ParentDB.addParent(par1);
		assertEquals("Test that the size of parent list is 1 after adding a parent", 1 , ParentDB.parentlist.size());
		//Test that view is equal to added parent
		assertNotNull("Test that view is successful",ParentDB.viewAllParent());
		assertSame("Test that the first element in parent list is the same as parent object added.",par1, ParentDB.parentlist.get(0));
		//Test that null values cannot be added to the category list
		assertNotNull("Test that parentlist added value is NOT null",ParentDB.parentlist.get(0));
		//Test that input can be removed;
		ParentDB.delParent("Mr Lim");		
		assertEquals("Test that the size is 0 after removing of Mr Lim",0,ParentDB.parentlist.size());
		//Test that menu works after adding Mr Lim and Mr Loo
		ParentDB.addParent(par1);
		ParentDB.addParent(par2);
		ParentDB.showParentMenu();
		assertEquals("Test that the menu works after adding Mr Lim and Mr Loo",par1, ParentDB.parentlist.get(0));
		assertEquals(" ",par2,ParentDB.parentlist.get(1));
 

		

		
		
	}


}
