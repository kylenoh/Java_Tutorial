package lesson16_OOP_Attribute;

public class Human {
	private String address;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void eat() {
		System.out.println("¸Ô±â");
	}
}
