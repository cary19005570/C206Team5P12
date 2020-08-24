import java.util.ArrayList;

public class StudentDB {

	private static final int OPTION_viewstudent = 1;
	private static final int OPTION_addstudent = 2;
	private static final int Option_deletestudent = 3;
	private static final int Option_updatestudent = 4;
	
	
	public static void main(String[] args) {
		
		ArrayList<Student>StudentList = new ArrayList<Student>();
		
		StudentList.add(new Student(14000,"Jaclyn Lee", "P4", "4A", "Ms Lim", "Janice Teo", "Janice@gmail.com", "withdrawn"));
		StudentList.add(new Student (15000, "Jasmine Goh", "P5","5B", "Mr Tan", "Jaslin Goh", "Jaslin@gmail.com", "not withdrawn"));
		
		int option = 0;
		
		while (option != 5) {
			
			StudentDB.menu();
			option = Helper.readInt ("Enter an option > ");
			
			if(option == OPTION_viewstudent) {
					StudentDB.viewStudents(StudentList);
				
			} else if (option == OPTION_addstudent) {
				Student s= inputStudent();
				if (StudentDB.inputStudent()!= null) {
					StudentDB.addStudent(StudentList, s);
				System.out.println("Student added.");
				} else {
					System.out.println("Student not added.");
				}
				
				
				
				
			} else if (option ==  Option_deletestudent) {
				if(StudentList.isEmpty()) {
					System.out.println("Student List is empty.");
				} else {
					StudentDB.delStudent(StudentList);
				}
				
					
			
		} else if (option == Option_updatestudent) {
			if(StudentList.isEmpty()) {
				System.out.println("Student List is empty.");
			} else {
				StudentDB.setStudent(StudentList);
			}
			
			
		}	else if (option == 5) {
			System.out.println("Bye!");
			
		} else {
			System.out.println("Invalid option");
		}


		}
	
		
	}


	public static void menu() {
		StudentDB.setHeader("STUDENT MENU");
		System.out.println("1. View all students");
		System.out.println("2. Add student");
		System.out.println("3. Delete student");
		System.out.println("4. Quit");
		Helper.line(80, "-");

		
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}

		//================================= Option 1 View =================================
		public static void viewStudents(ArrayList<Student> StudentList) {
			StudentDB.setHeader("STUDENT LIST");
			String output = String.format("%-10d %-30s %-10s %-20s %-10s %-15s %s \n", "STUDENT ID", "NAME", "GRADE", "CLASSROOM", "TEACHER", "PARENTNAME", "PARENTEMAIL");
			for (int i = 0; i <StudentList.size(); i++) {
				output += String.format("%-20s\n", StudentList.get(i).toString());
			}
			System.out.println(output);
		}
		
		//================================= Option 2 Add =================================
		public static Student inputStudent() {
			int studentid = Helper.readInt ("Enter a student id > ");
			String id = "" + studentid;
			if(id.length()==5) {
				String studentname = Helper.readString("Enter a student name > " );
				String grade = Helper.readString ("Enter student's grade > ");
				String classroom = Helper.readString ("Enter student's classroom > ");
				String teacher = Helper.readString ("Enter teacher > ");
				String parentName = Helper.readString ("Enter parentName > ");
				String parentEmail = Helper.readString ("Enter parentEmail > ");
				String ccastatus = Helper.readString("Enter the CCA status > ");
			
				Student s= new Student(studentid, studentname, grade,classroom, teacher, parentName, parentEmail, ccastatus);
				return s;
			}
			return null; 
	
		}
	
		public static void addStudent(ArrayList<Student> StudentList, Student s) {
			for(int i=0;i<StudentList.size();i++) { 
				if (s.getId()!=StudentList.get(i).getId() ) {
					
					StudentList.add(s);
				}
			}
			
			
		}
		
		//================================= Option 3 Delete =================================
		public static void delStudent(ArrayList<Student> StudentList) {
		StudentDB.setHeader("STUDENT LIST");	
		String output = String.format("%-10d %-30s %-10s %-20s %-10s %-15s %s \n", "STUDENT ID", "NAME", "GRADE", "CLASSROOM", "TEACHER", "PARENTNAME", "PARENTEMAIL");
		for (int i = 0; i <StudentList.size(); i++) {
			output += String.format("%-20s\n", StudentList.get(i).toString());
		}
		System.out.println(output);
		
		int delID = Helper.readInt("Enter Student ID to delete > ");
		
		boolean check = true;
		
		int i = 0; //for while loop
		int index = 0; //for index
		
		//start while loop (check)
		while (i < StudentList.size()) {
			if (StudentList.get(i).getId() == delID) {
				check = true; //if student id exist
				index = i;
				break; //once found, loop will stop 
			} else {
				check = false;
				//no need break
			}
			i++; //next one
			
		}
		if(check==true) { //found the ID and deleted
			StudentList.remove(index); 
			System.out.println("Student has been removed.");
		} else { //cannot find student ID
			System.out.println("Invalid Student ID.");
		}
		
		}
		//================================= Option 4 Update =================================
		public static void setStudent(ArrayList<Student> StudentList) {
			StudentDB.setHeader("STUDENT LIST");	
			String output = String.format("%-10d %-30s %-10s %-20s %-10s %-15s %-10s %s \n", "STUDENT ID", "NAME", "GRADE", "CLASSROOM", "TEACHER", "PARENTNAME", "PARENTEMAIL", "CCASTATUS");
			for (int i = 0; i <StudentList.size(); i++) {
				output += String.format("%-20s\n", StudentList.get(i).toString());
			}
			System.out.println(output);
			
			int updateID = Helper.readInt("Enter Student ID to update > ");
			
			boolean check = true;
			int i = 0; //for while loop
			int index = 0; //for index
			
			//start while loop (check)
			while (i < StudentList.size()) {
				if (StudentList.get(i).getId() == updateID) {
					check = true; //if student id exist
					index = i;
					break; //once found, loop will stop 
				} else {
					check = false;
				}
				i++; 	
				}
			if(check==true) {
				String updated = Helper.readString("Enter updated details > ");
				StudentList.get(index).setName(updated);
				StudentList.get(index).setGrade(updated);
				StudentList.get(index).setClassroom(updated);
				StudentList.get(index).setTeacher(updated);
				StudentList.get(index).setParentName(updated);
				StudentList.get(index).setParentEmail(updated);
				StudentList.get(index).setCcastatus(updated);
				
				System.out.println("Student detailed has been updated.");
				
			
			}else {
				System.out.println("Update not successful.");
			}
		
			
		

      }
}