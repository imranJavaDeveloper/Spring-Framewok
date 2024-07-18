package simple2.bean;
public class Teacher {
	
	private int id;
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
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	
	// create show method
	public void show() {
		System.out.println("Id :"+id);
		System.out.println("Name : "+name);
		System.out.println("Address :"+addresse);
	}
	private String name;
	private String addresse;

}
