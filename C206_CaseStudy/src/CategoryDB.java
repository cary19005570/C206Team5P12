import java.util.ArrayList;

public class CategoryDB {

	public static ArrayList<Category> categoryList = new ArrayList<Category>();
	
	public static void addCategory(Category cat) {
		categoryList.add(cat);
		
	}
	
	public static String viewAllCategory() {
		String output = " ";
		for (int i = 0; i<categoryList.size(); i++) {
			output += categoryList.get(i).toString();
		}
		System.out.println(output);
		return output;
	}
	
	


}
