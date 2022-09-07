package entities;

public class HostelRoom {
	private int room;
	private String name;
	private String email;

	public HostelRoom(int room, String name, String email) {
		this.room = room;
		this.name = name;
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
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
}
