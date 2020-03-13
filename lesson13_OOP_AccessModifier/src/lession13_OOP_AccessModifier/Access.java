package lession13_OOP_AccessModifier;

public class Access {
	public String publicName = "아무곳에서 접근할 수 있습니다.";
	private String privateName = "해당 클래스 내부에서만 사용 할 수 있습니다.";
	protected String protectedName = "같은 패키지에 있는 클래스와 상속관계의 클래스들만 허용";
	String nullName ="같은 패키지에 있는 클래스들만 허용";
	
	public Access() {
		// TODO Auto-generated constructor stub
	}

	public Access(String publicName, String privateName, String protectedName, String nullName) {
		super();
		this.publicName = publicName;
		this.privateName = privateName;
		this.protectedName = protectedName;
		this.nullName = nullName;
	}

	public String getPublicName() {
		return publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getPrivateName() {
		return privateName;
	}

	public void setPrivateName(String privateName) {
		this.privateName = privateName;
	}

	public String getProtectedName() {
		return protectedName;
	}

	public void setProtectedName(String protectedName) {
		this.protectedName = protectedName;
	}

	public String getNullName() {
		return nullName;
	}

	public void setNullName(String nullName) {
		this.nullName = nullName;
	}
	
	
			
}
