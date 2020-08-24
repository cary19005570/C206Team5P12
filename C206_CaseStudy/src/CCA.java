
public class CCA {
	private String title;
	private String description;
	private int classSize;
	private String dayOfWeek;
	private String timeofCCA;
	private String venue;
	private String instructorName;
	
	public CCA(String title,String description,int classSize,String dayOfWeek,String timeofCCA,String venue,String instructorName) {
		this.title = title;
		this.description = description;
		this.classSize = classSize;
		this.dayOfWeek = dayOfWeek;
		this.timeofCCA = timeofCCA;
		this.venue = venue;
		this.instructorName = instructorName;
   }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTimeofCCA() {
		return timeofCCA;
	}

	public void setTimeofCCA(String timeofCCA) {
		this.timeofCCA = timeofCCA;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String toString() {
		String output = "";;
		output += String.format("%-10s %-30s %-10d %-20s %-10s %-15s %s \n",title, description, classSize,dayOfWeek, timeofCCA, venue, instructorName);
		return output;		
	}
}
