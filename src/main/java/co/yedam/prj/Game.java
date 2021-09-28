package co.yedam.prj;

import java.util.Arrays;
import java.util.Scanner;

// 실습 project(오전)
// 로또번호 생성기
// (1000원 - 1게임(1장)
// 10000원 - 10게임(2장)) (1장에 5게임)
// (10500원 - 500원 거스름돈으로 돌려주기)
// (5게임이후엔 구분선)
// (1~45, 6개의 번호, 작은번호 부터 큰번호, 동일한 번호는 나오면 안돼)

public class Game {
	private int coin;
	Scanner sc = new Scanner(System.in);
	private int[] strike = new int[6];

	private int readInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

//	Game game = new Game();

	private void LottoNumber() {
		for (int i = 0; i < strike.length; i++) {
			strike[i] = (int) (Math.random() * 45 + 1);
//			int num = (int) (Math.random() * 45 + 1);
//			strike[i] = num;
			for (int j = 0; j < i; j++) {
				if (strike[i] == strike[j]) {
					i--;
				}
			}
		}
		Arrays.sort(strike);
	}

	public int insertMenu() {
		System.out.println("=====================");
		int i = readInt("사용하실 금액을 입력하여주세요.");
		System.out.println("=====================");
		System.out.println(i + "원을 사용하였습니다.");
		if (i % 1000 != 0) {
//			int coin = (i- i % 1000)/1000;
			System.out.println(i % 1000 + "원을 거슬러드렸습니다.");
		}
		return coin = i;

	}

	public void playMenu() {
		

	}

}
