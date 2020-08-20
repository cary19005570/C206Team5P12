*import static org.junit.Test;


public class CategoryTest {
	
	private Category cat1;
	private Category cat2;
	
	public void setUp() throws Exception {
		cat1 = new Category("001", "Sports");
		cat2 = new Category("002", "Cooking");
		
	}
	
	public void tearDown() throws Exception {
		cat1 = null;
		cat2 = null;
	}
	
	public void addCategoryTest() {
		
		//Test that category list is NOT null
		asserNotNull("Test that category list is NOT null", CategoryDB.categoryList);
		
		//Test that the category list size is 0 before adding any categories
		assertEquals("Test that the category list size is 0 before adding any category", 0, CategoryDB.categoryList).size();
		
		//Test that the size of category list is 1 after adding a category
		CategoryDB.addCategory(cat1);
		assertEquals("Test that the size of category list is 1 after adding a category", 1, CategoryDB.categoryList.size());
		
		//Test that the first element in category list is the same as the Category object added.
		assertSame("Test that the first element in category list is the same as the Category object added.", cat1, CategoryDB.categoryList.get(0));
		
		//Test that null values cannot be added to the category list
	}

	private void assertSame(String string, Category cat12, Category category) {
		// TODO Auto-generated method stub
		
	}

	private Object assertEquals(String string, int i, Object categoryList) {
		// TODO Auto-generated method stub
		return null;
	}

	private void asserNotNull(String string, Object categoryList) {
		
	}

}
