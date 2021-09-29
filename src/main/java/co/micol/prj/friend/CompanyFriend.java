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
		System.out.println("���� : ����ģ��");
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + company);
		

	}


}
