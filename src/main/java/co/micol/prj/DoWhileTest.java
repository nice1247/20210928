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
		System.out.println("=== 1. 입력 하기 ===");
		System.out.println("=== 2. 수정 하기 ===");
		System.out.println("=== 3. 조회 하기 ===");
		System.out.println("=== 4. 종료 하기 ===");
		System.out.println("===================");
		System.out.println("원하는 작업번호를 입력하세요.");
	}

	private void firstMenu() {
		System.out.println("============================");
		System.out.println("=== 여기는 입력하는 화면입니다.===");
		System.out.println("============================");

		System.out.println("=== 어느 곳에 추가하시겠습니까? ===");
		int i = readInt("1.School         2.Company");

		String name = readStr("친구의 이름을 입력하세요.");
		String tel = readStr("친구의 연락처를 입력하세요.");
		String address = readStr("친구의 주소를 입력하세요.");

		Friend friend = null;
		if (i == 1) {
			String school = readStr("학교 입력");
			friend = new SchoolFriend(name, tel, address, school);

		} else if (i == 2) {
			String company = readStr("회사 입력");
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
		System.out.println("=== 여기는 수정하는 화면입니다.===");
		System.out.println("============================");
		System.out.println("=== 어느 곳에서 수정하시겠습니까? ===");
		int i = readInt("1.School         2.Company");
		boolean check = false;
		if (i == 1) {
			String name = readStr("수정할 사람의 이름 입력하세요");
			String tel = readStr("수정할 연락처 입력[변경x > Enter]");
			String address = readStr("수정할 주소 입력[변경x > Enter]");
			String school = readStr("수정할 학교 입력[변경x > Enter]");
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
				System.out.println("수정되었습니다.");
			else
				System.out.println("없는 값입니다.");
		}

		if (i == 2) {
			String name = readStr("수정할 사람의 이름 입력하세요");
			String tel = readStr("수정할 연락처 입력[변경x > Enter]");
			String address = readStr("수정할 주소 입력[변경x > Enter]");
			String company = readStr("수정할 회사 입력[변경x > Enter]");
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
				System.out.println("수정되었습니다.");
			else
				System.out.println("없는 값입니다.");
		}
	}

	private void thirdMenu() {
		System.out.println("============================");
		System.out.println("=== 여기는 조회하는 화면입니다.===");
		System.out.println("============================");
		System.out.println("=== 어느 곳에서 찾겠습니까? ===");
		int i = readInt("1.School         2.Company");
		System.out.println("-친구목록-");
		for (int j = 0; j < friends.length; j++) {
			if (i == 1 && friends[j] != null) {
				System.out.print(((SchoolFriend) friends[j]).getName() + " ");
				
			} if (i == 2 && friends[j] != null) {
				System.out.print(((CompanyFriend) friends[j]).getName() + " ");
			}

		}
		System.out.println("");
		System.out.println("조회하고 싶은 사람의 이름을 입력하세요.");
		String name = readStr("이름 입력[Enter > 모두 출력");

		for (int k = 0; k < friends.length; k++) {

			if (i == 1 && friends[k] != null && friends[k].getName().indexOf(name) != -1) {
				friends[k].friendPrint();
			} else if (i == 2 && friends[k] != null && friends[k].getName().indexOf(name) != -1) {
				friends[k].friendPrint();
			}

		}

		// 클래스명.friendPrint();
		// schfriends[i] = 이친구도 schfriend class 의 모든필드와 메소드에 접근할 수 있는 class의 인스턴스.

		// Class 이름이 안된 이유가...
		/*
		 * 
		 * STATIC 으로 뭐 하라고 그런말이 있었는데 ... 이게 static으로 선언을하면 => 프로그램이 컴파일 되기전에 미리 메모리에
		 * 올라가져 있어요. 사용자에 의해서 크기가 결정되는 친구가 아닌게 되요 (new 같이 사용자에 의해서 크기가 결정이 되는게 아니에요)
		 * 클래스명.friendPrint(); FriendExe fx = FriendExe.getInstance(); fx.run(); 이미 크기가
		 * 다 결정되어 있고 이미 다 메모리에 올라가 있기 때문에 상관이 없어요. 근데 지금처럼 new로 만드는 이런 경우는 이미 메모리에 올라가
		 * 있는 상태가 X. -> 우리가 크기를 결정해줬어요. -> new를 통해서..
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
			sc.nextLine(); // 버퍼 클리어 역할
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
