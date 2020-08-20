
public class Parent {
	private String name;
	private String email;
	private String studentid;
	private String studentName;
	private String studentGrade;
	private String classroom;
	private String teacher;
	
	public Parent(String name, String email, String studentid, String studentName, String studentGrade, String classroom, String teacher) {
		this.name = name;
		this.email = email;
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentGrade = studentGrade;
		this.classroom = classroom;
		this.teacher = teacher;
	}
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
 
	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
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
	 public String toString(){
		  return name + " " + email + " " + studentid + " " + studentName + " " + studentGrade + " " + classroom + " " + teacher; 

}
}
