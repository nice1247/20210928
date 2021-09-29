package co.micol.prj;

import java.util.Scanner;

import co.micol.prj.friend.CompanyFriend;
import co.micol.prj.friend.Friend;
import co.micol.prj.friend.SchoolFriend;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	private static DoWhileTest one = new DoWhileTest();
	private Friend[] friends;

	private DoWhileTest() {
		friends = new Friend[100];
	}

	public static DoWhileTest getInstance() {
		return one;
	}

	private int readInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	private String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	private void mainMenu() {
		System.out.println("===================");
		System.out.println("=== 1. �Է� �ϱ� ===");
		System.out.println("=== 2. ���� �ϱ� ===");
		System.out.println("=== 3. ��ȸ �ϱ� ===");
		System.out.println("=== 4. ���� �ϱ� ===");
		System.out.println("===================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��ϼ���.");
	}

	private void firstMenu() {
		System.out.println("============================");
		System.out.println("=== ����� �Է��ϴ� ȭ���Դϴ�.===");
		System.out.println("============================");

		System.out.println("=== ��� ���� �߰��Ͻðڽ��ϱ�? ===");
		int i = readInt("1.School         2.Company");

		String name = readStr("ģ���� �̸��� �Է��ϼ���.");
		String tel = readStr("ģ���� ����ó�� �Է��ϼ���.");
		String address = readStr("ģ���� �ּҸ� �Է��ϼ���.");

		Friend friend = null;
		if (i == 1) {
			String school = readStr("�б� �Է�");
			friend = new SchoolFriend(name, tel, address, school);

		} else if (i == 2) {
			String company = readStr("ȸ�� �Է�");
			friend = new CompanyFriend(name, tel, address, company);

		}
		for (int k = 0; k < friends.length; k++) {
			if (friends[k] == null) {
				friends[k] = friend;
				break;
			}
		}
	}

	private void secondMenu() {
		System.out.println("============================");
		System.out.println("=== ����� �����ϴ� ȭ���Դϴ�.===");
		System.out.println("============================");
		System.out.println("=== ��� ������ �����Ͻðڽ��ϱ�? ===");
		int i = readInt("1.School         2.Company");
		boolean check = false;
		if (i == 1) {
			String name = readStr("������ ����� �̸� �Է��ϼ���");
			String tel = readStr("������ ����ó �Է�[����x > Enter]");
			String address = readStr("������ �ּ� �Է�[����x > Enter]");
			String school = readStr("������ �б� �Է�[����x > Enter]");
			for (int k = 0; k < friends.length; k++) {
				if (friends[k] != null && friends[k].getName().indexOf(name) != -1) {
					if (!tel.equals("")) {
						friends[k].setTel(tel);
					}
					if (!address.equals("")) {
						friends[k].setAddress(address);
					}
					if (!school.equals("")) {
						((SchoolFriend) friends[k]).setSchool(school);
					}
					check = true;
				}
			}
			if (check)
				System.out.println("�����Ǿ����ϴ�.");
			else
				System.out.println("���� ���Դϴ�.");
		}

		if (i == 2) {
			String name = readStr("������ ����� �̸� �Է��ϼ���");
			String tel = readStr("������ ����ó �Է�[����x > Enter]");
			String address = readStr("������ �ּ� �Է�[����x > Enter]");
			String company = readStr("������ ȸ�� �Է�[����x > Enter]");
			for (int k = 0; k < friends.length; k++) {
				if (friends[k] != null && friends[k].getName().indexOf(name) != -1) {
					if (!tel.equals("")) {
						friends[k].setTel(tel);
					}
					if (!address.equals("")) {
						friends[k].setAddress(address);
					}
					if (!company.equals("")) {
						((CompanyFriend) friends[k]).setCompany(company);
					}
					check = true;
				}
			}
			if (check)
				System.out.println("�����Ǿ����ϴ�.");
			else
				System.out.println("���� ���Դϴ�.");
		}
	}

	private void thirdMenu() {
		System.out.println("============================");
		System.out.println("=== ����� ��ȸ�ϴ� ȭ���Դϴ�.===");
		System.out.println("============================");
		System.out.println("=== ��� ������ ã�ڽ��ϱ�? ===");
		int i = readInt("1.School         2.Company");
		System.out.println("-ģ�����-");
		for (int j = 0; j < friends.length; j++) {
			if (i == 1 && friends[j] != null) {
				System.out.print(((SchoolFriend) friends[j]).getName() + " ");
				
			} if (i == 2 && friends[j] != null) {
				System.out.print(((CompanyFriend) friends[j]).getName() + " ");
			}

		}
		System.out.println("");
		System.out.println("��ȸ�ϰ� ���� ����� �̸��� �Է��ϼ���.");
		String name = readStr("�̸� �Է�[Enter > ��� ���");

		for (int k = 0; k < friends.length; k++) {

			if (i == 1 && friends[k] != null && friends[k].getName().indexOf(name) != -1) {
				friends[k].friendPrint();
			} else if (i == 2 && friends[k] != null && friends[k].getName().indexOf(name) != -1) {
				friends[k].friendPrint();
			}

		}

		// Ŭ������.friendPrint();
		// schfriends[i] = ��ģ���� schfriend class �� ����ʵ�� �޼ҵ忡 ������ �� �ִ� class�� �ν��Ͻ�.

		// Class �̸��� �ȵ� ������...
		/*
		 * 
		 * STATIC ���� �� �϶�� �׷����� �־��µ� ... �̰� static���� �������ϸ� => ���α׷��� ������ �Ǳ����� �̸� �޸𸮿�
		 * �ö��� �־��. ����ڿ� ���ؼ� ũ�Ⱑ �����Ǵ� ģ���� �ƴѰ� �ǿ� (new ���� ����ڿ� ���ؼ� ũ�Ⱑ ������ �Ǵ°� �ƴϿ���)
		 * Ŭ������.friendPrint(); FriendExe fx = FriendExe.getInstance(); fx.run(); �̹� ũ�Ⱑ
		 * �� �����Ǿ� �ְ� �̹� �� �޸𸮿� �ö� �ֱ� ������ ����� �����. �ٵ� ����ó�� new�� ����� �̷� ���� �̹� �޸𸮿� �ö�
		 * �ִ� ���°� X. -> �츮�� ũ�⸦ ����������. -> new�� ���ؼ�..
		 * 
		 */
		System.out.println("");

	}

	private void endMenu() {
		System.out.println("==== Good bye ====");
	}

	private void doWhileMenu() {
		boolean b = true;
		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // ���� Ŭ���� ����
			switch (key) {
			case 1:
				firstMenu();
				break;
			case 2:
				secondMenu();
				break;
			case 3:
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = false;
				break;
			}
		} while (b);
	}

	public void run() {
		doWhileMenu();
		sc.close();
	}
}
