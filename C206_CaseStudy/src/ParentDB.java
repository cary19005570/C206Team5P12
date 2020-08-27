import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
public class ParentDB {
	public static ArrayList<Parent> parentlist = new ArrayList <Parent>();
	public static void main(String[] args) {
		Parent test = new Parent(0,"Mr Lime","notcoolnotcool@lame.com","13000","Samuel","Pri 3","3A","Ms Sally");
		parentlist.add(test);
		int choice = 0;
		while (choice != 10) {
			String output = "Welcome to the Parent menu, please select your option \n1)Add Parent\n2)Delete Parent\n3)Edit Parent\n4)View Parent Menu\n5)Generate CCA Reg ID for parent"
					+ "\n6)Login with CCA Reg and Student ID \n10)Exit system";
			System.out.println(output);
			choice = Helper.readInt("Option > ");
			if (choice == 1) {
				String name = Helper.readString("Enter name of parent");
				String email= Helper.readString("Enter email");
				int check = IDGenerator(email);
				while (check == 0) {
					email = Helper.readString("Invalid email, please enter again");
					check = IDGenerator(email);
				}
				String studentid = Helper.readString("Enter Student ID");
				String studentname = Helper.readString("Enter student name");
				String studentclass = Helper.readString("Enter student class");
				String grade = Helper.readString("Enter student grade (EG:Pri 1)");
				String teacher = Helper.readString("Enter student teacher");
				
				Parent par1 = new Parent(0,name,email,studentid,studentname,grade,studentclass,teacher);
				parentlist.add(par1);
				System.out.println(name + " entered into the system\n Returning to main menu");
			}
			if (choice == 2) {
				showParentMenu();
				String delet = Helper.readString("Enter name of parent to be removed");
				delParent(delet);
			}
			if (choice == 3) {
				showParentMenu();
				String parselect = Helper.readString("Enter name of parent to edit");
				int check = 0;
				while (check == 0) {
				for (int i = 0; i<parentlist.size(); i++) {
					if (parselect.contentEquals(parentlist.get(i).getName())) {
						int choice2 = Helper.readInt("What would you like to edit? \n1)Name\n2)Email\n3)Student ID\n4)Student Name\n5)Student grade\n6)Student class\n7)Teacher\n8)Exit edit menu");
						if (choice2 == 1) {
							String newname = Helper.readString("Enter new name");
							parentlist.get(i).setName(newname);
							check = 1;
							
						}
						else if (choice2 == 2) {
							String newemail = Helper.readString("Enter new Email");
							parentlist.get(i).setEmail(newemail);
							check = 1;
						}
						else if (choice2 == 3) {
							String newsid = Helper.readString("Enter new student ID");
							parentlist.get(i).setStudentid(newsid);
							check = 1;
						}
						else if (choice2 == 4) {
							String newsname = Helper.readString("Enter new student name");
							parentlist.get(i).setStudentName(newsname);
							check = 1;
						}
						else if (choice2 == 5) {
							String newgrade = Helper.readString("Enter new grade");
							parentlist.get(i).setStudentGrade(newgrade);
							check = 1;
						}
						else if (choice2 == 6) {
							String newclass = Helper.readString("Enter new student class");
							parentlist.get(i).setClassroom(newclass);
							check = 1;
						}
						else if (choice2 == 7) {
							String newteacher = Helper.readString("Enter new teacher");
							parentlist.get(i).setTeacher(newteacher);
							check = 1;
						}
						System.out.println("New Parent info is " + parentlist.get(i));
						check = 1;
					}
				}
				System.out.println("Invalid parent");
				check = 1;
				}
			}
			if (choice == 4) {
				showParentMenu();
			}
			if (choice == 5) {
				boolean check = false;
				showParentMenu();
				String namechoice = Helper.readString("Enter name of parent to generate CCA ID. This will be sent to the email if it is valid. CCA ID = 0 means that there is an error in the email (no @ symbol)");
				for (int i = 0; i<parentlist.size(); i++)
					if (namechoice.contentEquals(parentlist.get(i).getName())) {
						int ID = IDGenerator(parentlist.get(i).getEmail());
						parentlist.get(i).setCCAregid(ID);
						check = true;
						System.out.println("Your ID generated is " + ID);
					}
				if (check == false) {
					System.out.println("Invalid parent");
				}
			}
			if (choice == 6) {
				int ccaregidinput = Helper.readInt("Enter CCA Registration ID > ");
				String studentidinput = Helper.readString("Enter Student ID > ");
				if (logincheck(ccaregidinput,studentidinput) == true) {
					System.out.println("System to be integrated");
				}
			}
			if (choice == 10) {
				System.out.println("Good bye!");
				break;
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	public static void addParent(Parent par) {
		if (par != null) {
		parentlist.add(par);
	}
	}

	 
	public static String viewAllParent() {
		String output = "";
		for (int i = 0; i<parentlist.size(); i++ ) {
			output += parentlist.get(i).toString();
			System.out.println(output);
		}
		return output;
	}
	public static void delParent(String name) {
		for (int i = 0; i<parentlist.size(); i++)
			if (name.contentEquals(parentlist.get(i).getName())) {
				parentlist.remove(i);
			}
	}
	public static void showParentMenu() {
		String output = String.format("%-10s %-10s %-25s %-15s %-15s %-15s %-10s %-10s\n","CCA Reg ID","Name", "email", "Student ID", "Student Name", "Student Grade"
				,"Classroom", "Teacher");
			System.out.println(output);
			for (int i = 0; i<parentlist.size();i++ ) {
				String output2 = String.format("%-10s %-10s %-25s %-15s %-15s %-15s %-10s %-10s\n", parentlist.get(i).getCCAregid(),parentlist.get(i).getName(),parentlist.get(i).getEmail(),
						parentlist.get(i).getStudentid(),parentlist.get(i).getStudentName(),parentlist.get(i).getStudentGrade(),parentlist.get(i).getClassroom()
						,parentlist.get(i).getTeacher());
				System.out.println(output2);
			}
		}
	public static void updateParent(Parent par, Parent par2) {

		for (int i = 0; i<parentlist.size(); i++)
			if (par == parentlist.get(i)) {
				parentlist.set(i, par2);
			}
	}
	
	public static int IDGenerator(String email) {
		Random rand = new Random();
		Boolean check = false;
		int ID = 0;
		for (int i = 0; i<email.length();i++) {
			char test = email.charAt(i);
			if (test == '@' && check == false) {
				check = true;
				ID = rand.nextInt(1000);
			}
		
	}
		return ID;

	}
	
	public static void SETID(Parent par, int ID) {
		par.setCCAregid(ID);
		System.out.println(ID);
	}
	
	
	public static boolean logincheck(int ccaregid, String studentid) {
		for (int i = 0; i<parentlist.size();i++ ) {
			if (ccaregid == parentlist.get(i).getCCAregid()) {
				if (studentid.contentEquals(parentlist.get(i).getStudentid())){
					System.out.println("Login success");
					return true;
				}
			}
		}
		System.out.println("Login failure");
		return false;
	}
}

	
	