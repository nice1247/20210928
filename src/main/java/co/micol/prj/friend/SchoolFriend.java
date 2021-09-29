package co.micol.prj.friend;

public class SchoolFriend extends Friend {
	private String school;
	
	public SchoolFriend(String name, String tel, String address, String school) {
		super(name, tel, address);
		this.school = school;
	}

	
	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	@Override
	public void friendPrint() {
		System.out.println("���� : �б�ģ��");
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("�б� : " + school);
		
	}


}
