package co.yedam.prj;

import java.util.Arrays;
import java.util.Scanner;

// �ǽ� project(����)
// �ζǹ�ȣ ������
// (1000�� - 1����(1��)
// 10000�� - 10����(2��)) (1�忡 5����)
// (10500�� - 500�� �Ž��������� �����ֱ�)
// (5�������Ŀ� ���м�)
// (1~45, 6���� ��ȣ, ������ȣ ���� ū��ȣ, ������ ��ȣ�� ������ �ȵ�)

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
		int i = readInt("����Ͻ� �ݾ��� �Է��Ͽ��ּ���.");
		System.out.println("=====================");
		System.out.println(i + "���� ����Ͽ����ϴ�.");
		if (i % 1000 != 0) {
//			int coin = (i- i % 1000)/1000;
			System.out.println(i % 1000 + "���� �Ž�����Ƚ��ϴ�.");
		}
		return coin = i;

	}

	public void playMenu() {
		

	}

}
