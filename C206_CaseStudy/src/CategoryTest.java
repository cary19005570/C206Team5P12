import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	
	private Category cat1;
	private Category cat2;
	
	@Before
	public void setUp() throws Exception {
		cat1 = new Category("001","Sports");
		cat2 = new Category("002", "Cooking");
	}
	@After
	public void tearDown() throws Exception {
		cat1 = null;
		cat2 = null;
		CategoryDB.categoryList.clear();
	}
	@Test
	public void addCategoryTest() {
		
		//Test that category list is NOT null
		
		assertNotNull("Test that category list is NOT null",CategoryDB.categoryList);
		
		//Test that the category list size is 0 before adding any category
		assertEquals("Test that the category list size is 0 before adding any parents", 0,CategoryDB.categoryList.size());
		
		//Test that the size of category list is 1 after adding a category
		CategoryDB.addCategory(cat1);
		assertEquals("Test that the size of category list is 1 after adding a category", 1 , CategoryDB.categoryList.size());
		
		assertSame("Test that the first element in category list is the same as category object added.",cat1, CategoryDB.categoryList.get(0));
		assertNotNull("Test if the category can be viewed or not", CategoryDB.viewAllCategory());
		
		//Test that null values cannot be added to the category list
		assertNotNull("Test that categorylist added value is NOT null",CategoryDB.categoryList.get(0));
		
	}


}