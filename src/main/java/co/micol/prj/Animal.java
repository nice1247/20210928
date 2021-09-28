package co.micol.prj;

public abstract class Animal {	// 자기자신을 인스턴스로 생성못함  / 생성자생성 x
	public abstract void run();

	public void sleep() {
		System.out.println("잠을 잡니다.");
	}

}
