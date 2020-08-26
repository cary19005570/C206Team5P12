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
	
	public static void delCategory(String categoryId) {
		for (int i = 0; i < categoryList.size(); i++)
			if (categoryId == categoryList.get(i).getCategoryId()) {
				categoryList.remove(i);
			}
		
	}
	
	public static void showCategoryMenu() {
		String output = String.format("%-10s %-20s\n", "", "Category ID", "Category");
		
			System.out.println(output);
			
			for (int i = 0; i<categoryList.size();i++ ) {
				String output2 = String.format("%-10s %-20s\n", categoryList.get(i).getCategoryId(),categoryList.get(i).getCategory());
				System.out.println(output2);
			}
		
		
	}
	
	public static void UpdateCCAdetails(String categoryId) {
		for (int i = 0; i < categoryList.size(); i ++) {
			if (categoryId == categoryList.get(i).getCategoryId()) {
				
			}
		}
	}
	public static void CheckDupCCA() {
		// There should be no duplicate categories added to the system 
		for (int i = 0; i < categoryList.size(); i++) {
			for (int j =i+1; j< categoryList.size(); j++) {
				if (categoryList.get(i).equals(categoryList.get(j))) {
					categoryList.remove(j);
					j--;
				}
			}
		}
	}


}
