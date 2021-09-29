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
		System.out.println("구분 : 학교친구");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + school);
		
	}


}
