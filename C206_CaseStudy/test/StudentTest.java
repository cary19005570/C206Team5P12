import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	private Student stud1;
	private Student stud2;
	private ArrayList<Student> StudentList;
	
	@Before
	public void setUp() throws Exception {
		stud1 = new Student(14000,"Jaclyn Lee", "P4", "4A", "Ms Lim", "Janice Teo", "Janice@gmail.com", "withdrawn");
		stud2 = new Student (15000, "Jasmine Goh", "P5","5B", "Mr Tan", "Jasline Goh", "Jasline@gmail.com","not withdrawn");
		
		StudentList= new ArrayList<Student>();
	}

	@After
	public void tearDown() throws Exception {
		stud1 = null;
		stud2 = null;
		StudentList = null;
	}

	@Test
	public void addStudentTest() {
		//Test that student list is NOT null
		assertNotNull("Test that student list is NOT NULL.", StudentList);
		
		//Test that student list size is 0 before adding any students
		assertEquals("Test that student list size is 0 before adding any students",0,StudentList.size());
		
		//Test that the size of student list is 1 after adding a student
		StudentDB.addStudent(StudentList,stud1);
		assertEquals("Test that the size of student list is 1 after adding a student",1, StudentList.size());
		
		//Test that the first element in student list is the same as student added
		assertSame("Test that the first element in student list is the same as student added", stud1, StudentList.get(0));
		
		//Test that null values cannot be added to the student list
		StudentDB.addStudent(StudentList,null);
		assertNotNull("Test that the element added into the array list is not null.");
	
	}
	
	public void viewStudentTest() {
		
		//Test if the student list is not null but empty
		assertNotNull("Test if there is valid student arraylist to view the students.", StudentList);
		
		//Test if the ArrayList for student is not empty
		assertNotEquals("Test that the student is not empty",StudentList.isEmpty());
		
		//Test if student list size is 2 after adding 2 students
		StudentDB.addStudent(StudentList,stud1);
		StudentDB.addStudent(StudentList,stud2);
		assertEquals("Test if student list size is 2 after adding 2 students", 2, StudentList.size());
			}

	
	public void DeleteStudentTest() {
		//Test if the student list is not null
		assertNotNull("Test if there is valid student arraylist to view the students.", StudentList);
		
		//Test that the student list is not empty
		assertNotEquals("Test that the student is not empty",StudentList.isEmpty());
		
		//Test if student list size is 2 after adding 2 students
		StudentDB.addStudent(StudentList,stud1);
		StudentDB.addStudent(StudentList,stud2);
		assertEquals("Test if student list size is 2 after adding 2 students", 2, StudentList.size());
		
		//Test if I delete one student from the list, the list decrease by 1
		StudentDB.delStudent(StudentList);
		assertEquals("Test if I delete one student from the list, the list decrease by 1",StudentList.size());
		
		
		  
		}
		public void updatestudentTest() {
			//Test if the student is not null
			assertNotNull("Test if there is valid student arraylist to view the students.", StudentList);
			
			//Test that the student list is not empty
			assertNotEquals("Test that the student is not empty",StudentList.isEmpty());
			
			//Test if student update his details, the details will be updated
			
			
			
		}
	}
				


