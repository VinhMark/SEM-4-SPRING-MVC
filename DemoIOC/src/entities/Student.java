package entities;

import java.util.List;

public class Student extends Human {

	private String id;
	private String name;
	private String avg;
	private Faculty faculty;
	private List<String> cources;

	
	public List<String> getCources() {
		return cources;
	}

	public void setCources(List<String> cources) {
		this.cources = cources;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	public Student(String id, String name, String avg) {
		super();
		this.id = id;
		this.name = name;
		this.avg = avg;
	}

	public Student(String id, String name, String avg, Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.faculty = faculty;
	}

	public Student(String id, String name, String avg, Faculty faculty, String gender, int age) {
		super(gender, age);
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.faculty = faculty;
	}

	public Student( String id, String name, String avg, Faculty faculty, String gender, int age,List<String> cources) {
		super(gender, age);
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.faculty = faculty;
		this.cources = cources;
	}

	public Student() {
		super();
	}

}
