package lession13_OOP_AccessModifier;

public class Access {
	public String publicName = "�ƹ������� ������ �� �ֽ��ϴ�.";
	private String privateName = "�ش� Ŭ���� ���ο����� ��� �� �� �ֽ��ϴ�.";
	protected String protectedName = "���� ��Ű���� �ִ� Ŭ������ ��Ӱ����� Ŭ�����鸸 ���";
	String nullName ="���� ��Ű���� �ִ� Ŭ�����鸸 ���";
	
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
