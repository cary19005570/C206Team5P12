
public class Student{
	
	private int id;
	private String name;
	private String grade;
	private String classroom;
	private String teacher;
	private String parentName;
	private String parentEmail;
	private String CCA;
	private String ccastatus;
	 
	public Student(int id, String name, String grade, String teacher, String parentName,
			String parentEmail, String CCA, String ccastatus) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.CCA = CCA;
		this.ccastatus = ccastatus;
	}


	public String getCcastatus() {
		return ccastatus;
	}


	public void setCcastatus(String ccastatus) {
		this.ccastatus = ccastatus;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public String toString() {
		String output = "";;
		output += String.format("%-10d %-30s %-10s %-20s %-10s %-15s %s \n",id, name, grade,classroom, teacher, parentName, parentEmail);
		return output;		
	}

	}
	


