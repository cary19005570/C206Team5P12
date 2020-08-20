import java.util.ArrayList;
public class ParentDB {
	
	public static ArrayList<Parent> parentlist = new ArrayList <Parent>();
	
	public static void addParent(Parent par) {
		if (par != null) {
		parentlist.add(par);
	}

}
}
