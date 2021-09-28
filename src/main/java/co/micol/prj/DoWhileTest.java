package co.micol.prj;

import java.util.Scanner;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);

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
		System.out.println("===메인메뉴는 아무키나 누르세요.===");
		System.out.println("============================");
		sc.nextLine();
	}

	private void secondMenu() {
		System.out.println("============================");
		System.out.println("=== 여기는 수정하는 화면입니다.===");
		System.out.println("===메인메뉴는 아무키나 누르세요.===");
		System.out.println("============================");
		sc.nextLine();
	}

	private void thirdMenu() {
		System.out.println("============================");
		System.out.println("=== 여기는 조회하는 화면입니다.===");
		System.out.println("===메인메뉴는 아무키나 누르세요.===");
		System.out.println("============================");
		sc.nextLine();
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
