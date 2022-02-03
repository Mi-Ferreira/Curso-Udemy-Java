package entities;

public class Student {

	private String name;
	private String e_mail;
	private int room;
	
	public Student(String name, String e_mail, int room) {
		this.name = name;
		this.e_mail = e_mail;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	
}
