package tr.com.vortechs.bilisim.bys.eyp.tool.dao;

public class TestDTO {
	private int id;
	private String name;
	private String mail;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "TestDTO [id=" + id + ", name=" + name + ", mail=" + mail + "]";
	}
	
	
	
	
}
