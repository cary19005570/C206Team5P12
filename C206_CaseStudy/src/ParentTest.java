import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ParentTest {
	
	private Parent par1;
	private Parent par2;
	private Parent par3;
	@Before
	public void setUp() throws Exception {
		par1 = new Parent("001","Mr Lim");
		par2 = new Parent("002", "Mr Soo");
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
		
		assertSame("Test that the first element in parent list is the same as parent object added.",par1, ParentDB.parentlist.get(0));
		
		//Test that null values cannot be added to the category list
		assertNotNull("Test that parentlist added value is NOT null",ParentDB.parentlist.get(0));
		
	}


}
