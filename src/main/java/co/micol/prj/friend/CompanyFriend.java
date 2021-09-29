package co.micol.prj.friend;

public class CompanyFriend extends Friend {
	private String company;

	public CompanyFriend(String name, String tel, String address, String company) {
		super(name, tel, address);
		this.company = company;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public void friendPrint() {
		System.out.println("구분 : 직장친구");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("직장 : " + company);
		

	}


}
